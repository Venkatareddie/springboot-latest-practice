package in.venkat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.venkat.model.Book;

@Service
public interface BookService {
	List<Book> getAll();

}
