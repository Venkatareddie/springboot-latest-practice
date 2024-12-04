package in.venkat;
import java.io.*;
import java.util.*;

public class FileReaderUtil {

    public List<Book> readFromFile(String filePath) throws IOException {
        List<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Assuming comma-separated values
                String[] values = line.split(",");
                if (values.length == 3) {
                    Book book = new Book();
                    book.setId(Integer.parseInt(values[0].trim())); 
                    book.setName(values[1].trim());  
                    book.setPrice(Double.parseDouble(values[2].trim()));
                    books.add(book);
                }
            }
        }
        return books;
    }
}
