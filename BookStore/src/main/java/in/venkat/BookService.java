package in.venkat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.itextpdf.text.DocumentException;

public class BookService {

	private BookDAO bookDAO;
	private ExcelGenration excelGenration;
	private GeneratePdf generatePdf;

	public BookService(BookDAO bookDAO, ExcelGenration excelGenration, GeneratePdf generatePdf) {
		this.bookDAO = bookDAO;
		this.excelGenration = excelGenration;
		this.generatePdf = generatePdf;
	}

	public void getData() throws IOException, DocumentException {
		List<Book> books = bookDAO.getBooks();

		// Print books to console
		// books.forEach(book -> System.out.println(book));
		// excelGenration.generateExcel(books);
		generatePdf.generatePdf(books);

		System.out.println("Book data has been processed and PDF generated.");
	}

	// Method to read books from a file and save them into the database
	public void storeBook() throws IOException {
		// Use try-with-resources to automatically close resources
		File file = new File("C:\\Users\\venka\\Downloads\\Workspace\\BookStore\\src\\main\\resources\\data.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file)) ;
			String lineString;

			// Read each line from the file
			while ((lineString = bufferedReader.readLine()) != null) {
				String[] dataString = lineString.split(",");

				// Parse the book data
				Integer id = Integer.parseInt(dataString[0]);
				String name = dataString[1];
				Double price = Double.parseDouble(dataString[2]);

				// Save the book to the database
				bookDAO.saveBook(id, name, price);
			}

			System.out.println("Books inserted into the DB table successfully.");
		}
		
	}

