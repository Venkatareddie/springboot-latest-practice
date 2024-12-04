package in.venkat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePdf {

    public void generatePdf(List<Book> books) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Books.pdf"));
        document.open();
        for (Book book : books) {
            document.add(new Paragraph("Book ID: " + book.getBookId()));
            document.add(new Paragraph("Book Name: " + book.getBookName()));
            document.add(new Paragraph("Book Price: " + book.getBookPrice()));
            document.add(new Paragraph("\n")); 
        }
        document.close();
        writer.close(); 

        System.out.println("PDF generated successfully!");
    }
}
