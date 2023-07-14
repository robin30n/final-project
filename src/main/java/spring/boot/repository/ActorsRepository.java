package spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.boot.model.Actors;

import java.util.List;

@Repository
public interface ActorsRepository extends JpaRepository<Actors, Long> {
    @Query("SELECT a FROM Actors a INNER JOIN a.movies m WHERE m.id = :id")
    List<Actors> findAllByMovie(@Param("id") Long id);
}
