package tech.wyvernp.tripadvisor.javaserver.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findUserByEmailIs(String email);
}
