package in.venkat.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.venkat.entity.Contact;
import in.venkat.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;

	public void saveContact() {
		Contact c1 = new Contact();
		c1.setCname("Swathi");
		c1.setCnumber(45635);
		c1.setCaddress("singatala@gmail.com");
		
		Contact c2 = new Contact();
		c2.setCname("Swathi");
		c2.setCnumber(45635);
		c2.setCaddress("singatala@gmail.com");
		
		Contact c3 = new Contact();
		c3.setCname("Swathi");
		c3.setCnumber(45635);
		c3.setCaddress("singatala@gmail.com");
		
		List<Contact> asList = Arrays.asList(c1,c2,c3);

		List<Contact> save = contactRepository.saveAll(asList);
		System.out.println(save);

	}
	
	

}
