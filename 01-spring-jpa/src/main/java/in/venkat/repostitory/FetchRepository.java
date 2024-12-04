package in.venkat.repostitory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.venkat.model.Book;

@Repository
public interface FetchRepository extends JpaRepository<Book,Integer>{

}
