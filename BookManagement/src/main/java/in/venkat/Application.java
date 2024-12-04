package in.venkat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {
        // Initialize the Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the FileReaderUtil and BookService beans from Spring context
        FileReaderUtil fileReaderUtil = new FileReaderUtil();
        BookService bookService = context.getBean(BookService.class);

        // Read the data from the text file
        List<Book> books = fileReaderUtil.readFromFile("C://Users//venka//Downloads//Workspace//BookManagement//book.txt");

        // Insert the books into the MySQL database
        bookService.insertBooks(books);

        System.out.println("Books inserted successfully!");
    }
}
