package in.venkat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.venkat.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
