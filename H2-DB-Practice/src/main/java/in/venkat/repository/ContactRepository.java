package in.venkat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.venkat.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	

}
