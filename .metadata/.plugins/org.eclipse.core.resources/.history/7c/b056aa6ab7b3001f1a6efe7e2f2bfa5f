package in.venkat.customgenerator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomOwnGenerator implements IdentifierGenerator {

    String prefix = "ORD"; // Define prefix
    String suffix = ""; // Placeholder for sequence value

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        try {
            // Get the next sequence value using Hibernate's doReturningWork
            suffix = session.doReturningWork(connection -> {
                Statement statement = connection.createStatement();
                // Query to get the next value of the sequence from Oracle (from dual)
                ResultSet resultSet = statement.executeQuery("SELECT sq.nextval from dual"); 
                
                if (resultSet.next()) {
                    int seqval = resultSet.getInt(1); // Retrieve sequence value
                    return String.valueOf(seqval); // Return sequence value as a string
                }
                return null; // In case there's no result
            });

        } catch (Exception e) {
            e.printStackTrace(); // Consider using a logger for error handling
        }

        // Concatenate the prefix with the generated sequence number (suffix)
        return prefix + suffix;
    }
}
