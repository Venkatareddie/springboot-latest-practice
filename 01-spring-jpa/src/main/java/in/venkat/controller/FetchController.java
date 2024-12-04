package in.venkat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.venkat.model.Book;
import in.venkat.service.BookService;

@RestController
@RequestMapping("/api")
public class FetchController {
	@Autowired
	private BookService bookService;
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAllBooks()
	{
	List<Book>books=bookService.getAll();
		return ResponseEntity.ok(books);
	}

}
