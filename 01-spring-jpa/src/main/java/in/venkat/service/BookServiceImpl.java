package in.venkat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.venkat.model.Book;
import in.venkat.repostitory.FetchRepository;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private FetchRepository fetchRepository;

	@Override
	public List<Book> getAll() {
	    List<Book> books = fetchRepository.findAll();
		 books.forEach(book -> System.out.println(book));  // Log the books
		    return books;
	}

}
