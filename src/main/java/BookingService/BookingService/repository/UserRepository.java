package BookingService.BookingService.repository;

import BookingService.BookingService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByPhone(String phone);

    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}