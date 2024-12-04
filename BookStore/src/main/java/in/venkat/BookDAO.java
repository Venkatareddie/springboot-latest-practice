package in.venkat;


import java.util.List;

public interface BookDAO {
	
	public void saveBook(int bookId, String bookName, double bookPrice);
	public List<Book> getBooks();
	
}
