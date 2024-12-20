package in.venkat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.venkat.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
