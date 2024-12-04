package in.venkat.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user_info")
public class User {
	
	@Id
	@Column(name="user_id")
	private Integer id;
	private String name;
	private Integer age;
	private String country;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createDate;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updatedDate;
	

}
