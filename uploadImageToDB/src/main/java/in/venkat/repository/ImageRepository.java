package in.venkat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.venkat.entity.Image;
@Repository
public interface ImageRepository extends JpaRepository<Image, Integer>{

}
