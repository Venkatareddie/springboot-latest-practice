package in.venkat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Method to insert a list of books into the database
    public void insertBooks(List<Book> books) {
        String sql = "INSERT INTO book (id, name, price) VALUES (?, ?, ?)";

        for (Book book : books) {
            jdbcTemplate.update(sql, book.getId(), book.getName(), book.getPrice());
        }
    }
}
