package spring.boot.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.model.Awards;

@Repository
@Transactional
public interface AwardsRepository extends JpaRepository<Awards, Long> {
}
