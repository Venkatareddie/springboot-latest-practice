package in.venkat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGenration {
	public void generateExcel(List<Book> books) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook();

		Sheet sheet = book.createSheet("Books-Data");

		Row headerRow = sheet.createRow(0);

		headerRow.createCell(0).setCellValue("Id");
		headerRow.createCell(1).setCellValue("Name");
		headerRow.createCell(2).setCellValue("Price");

		int dataRowIndex = 1;

		for (Book b : books) {

			Row dataRow = sheet.createRow(dataRowIndex);

			dataRow.createCell(0).setCellValue(b.getBookId());
			dataRow.createCell(1).setCellValue(b.getBookName());
			dataRow.createCell(2).setCellValue(b.getBookPrice());

			dataRowIndex++;
		}

		File f = new File("books.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);

		fos.close();
		book.close();

	}

}
