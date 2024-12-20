package in.venkat.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.venkat.model.Contact;
import in.venkat.model.Person;
import in.venkat.repo.ContactRepository;
import in.venkat.repo.PersonRepository;

@Service
public class SaveToDBService {

    @Autowired
    private ContactRepository contactRepository;
    
    @Autowired
    private PersonRepository personRepository;

   
    public void SaveDataToDB() {
        try {
            // Creating Person objects
            Person p1 = new Person();
            p1.setName("Venkat");
            p1.setAge(26);
            p1.setColour("Black");
            
            Person p2 = new Person();
            p2.setName("Swathi");
            p2.setAge(23);
            p2.setColour("Red");
            
            Person p3 = new Person();
            p3.setName("Venkat");
            p3.setAge(46);
            p3.setColour("Brown");
            
            // Save list of persons
            List<Person> list = Arrays.asList(p1, p2, p3);
            personRepository.saveAll(list);

          
            // Creating Contact objects
            Contact c1 = new Contact();
            c1.setCname("Venkat");
            c1.setAddress("Gurazala");
            c1.setCnum(798949052);
            
            Contact c2 = new Contact();
            c2.setCname("Swathi");
            c2.setAddress("Hyderabad");
            c2.setCnum(95634254);
            
            // Save list of contacts
            List<Contact> asList = Arrays.asList(c1, c2);
            contactRepository.saveAll(asList);

        } catch (Exception e) {
            // Log the exception or handle it further as needed
            e.printStackTrace();
            // Transaction will automatically rollback on this exception due to @Transactional
        }
    }
}
