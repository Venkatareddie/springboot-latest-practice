package in.venkat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.venkat.entity.Contact;
import in.venkat.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;

	public void saveContact() {
		Contact c = new Contact();
		c.setCname("Venkat");
		c.setCnumber(79490);
		c.setCaddress("venkat@gmail.com");

		Contact save = contactRepository.save(c);
		System.out.println(save);

	}
	
	

}
