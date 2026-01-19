package SpringJWT_OAuth2.Tut.repo;

import SpringJWT_OAuth2.Tut.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}