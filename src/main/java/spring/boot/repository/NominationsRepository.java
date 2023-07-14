package spring.boot.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.boot.model.Actors;
import spring.boot.model.Nominations;

import java.util.List;

@Repository
@Transactional
public interface NominationsRepository extends JpaRepository<Nominations, Long> {
    @Query("SELECT n FROM Movie m INNER JOIN m.nominations n WHERE m.id = :id")
    List<Nominations> findAllByMovie(@Param("id") Long id);
}
