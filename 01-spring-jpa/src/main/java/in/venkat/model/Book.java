package in.venkat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	@Column(name="bookId")
	private int bookId;
	private String bookName;
	private Float bookPrice;

}
