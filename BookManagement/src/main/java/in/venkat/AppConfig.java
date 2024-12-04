package in.venkat;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mysql.cj.jdbc.MysqlDataSource;

@Configuration
	@ComponentScan(basePackages = "in.venkat")
	@EnableTransactionManagement
	public class AppConfig {

	    @Bean
	    public DataSource dataSource() {
	        MysqlDataSource dataSource = new MysqlDataSource();
	        dataSource.setURL("jdbc:mysql://localhost:3306/books");
	        dataSource.setUser("root");
	        dataSource.setPassword("root");
	        return dataSource;
	    }

	    @Bean
	    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	        return new JdbcTemplate(dataSource);
	    }
}
