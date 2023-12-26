package uz.ahmadillo02.librarytaskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ahmadillo02.librarytaskapp.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

}
