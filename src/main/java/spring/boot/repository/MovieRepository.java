package spring.boot.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.model.Movie;

@Repository
@Transactional
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
