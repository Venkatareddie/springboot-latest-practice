package in.venkat;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAOImpl implements BookDAO {

	private JdbcTemplate jdbcTemplate;

	public BookDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveBook(int bookId, String bookName, double bookPrice) {

		String sqlString = "INSERT INTO book (bookId, bookName, bookPrice) VALUES (?, ?, ?)";

		jdbcTemplate.update(sqlString, ps -> {
			ps.setInt(1, bookId);
			ps.setString(2, bookName);
			ps.setDouble(3, bookPrice);
		});
	}

	@Override
	public List<Book> getBooks() {
		String sqlString="select * from book";
		return jdbcTemplate.query(sqlString, new BookRowMapper());
		
	}

	
}
