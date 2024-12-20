package in.venkat.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.venkat.entity.User;
import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	public List<User> findByCountry(String country);
	
	public List<User> findByCountryAndAge(String country,int age);
	
	public List<User> findByAgeGreaterThan(int age);
	
	@Query(value = "select * from user_info", nativeQuery=true)
	public List<User> getUsersSql();
	
	@Query("From User")
	public List<User>userDeatisHql();
	
	@Modifying
	@Transactional
    @Query("DELETE FROM User u WHERE u.age = :age")
    void deleteUserByAgeHql(@Param("age") int age);
	
	@Modifying
	@Transactional
	@Query("UPDATE User u SET u.country=:country  WHERE u.age=:age")
	public void updateCountry(@Param("age")int age,@Param("country") String country);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO user_info (user_id, name, age, country, create_date, updated_date) " +
	               "VALUES (:user_id, :name, :age, :country, CURRENT_DATE, UPDATED_DATE)", nativeQuery = true)
	public void insertUser(@Param("user_id") int id, @Param("name") String name, 
	                       @Param("age") int age, @Param("country") String country);

	
}
