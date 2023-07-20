package spring.boot.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.model.FeedBack;

import java.util.List;

@Repository
@Transactional
public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {
    void deleteAllByMovieId(Long id);
    List<FeedBack> findAllByMovieId(Long id);
}
