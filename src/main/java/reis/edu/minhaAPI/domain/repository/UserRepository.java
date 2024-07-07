package reis.edu.minhaAPI.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reis.edu.minhaAPI.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
