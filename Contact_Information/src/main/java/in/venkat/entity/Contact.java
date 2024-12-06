package in.venkat.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    @GeneratedValue(generator = "custom-gen")  
    @GenericGenerator(name = "custom-gen", strategy = "in.venkat.customgenerator.CustomOwnGenerator")
    private String cid;  // Change to String since your generator returns a String

    private String cname;
    private long cnumber;
    private String caddress;
}
