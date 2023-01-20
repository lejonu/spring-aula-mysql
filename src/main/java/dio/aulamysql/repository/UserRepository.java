package dio.aulamysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dio.aulamysql.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  // Query Method
  List<User> findByNameContaining(String name);

  // // Query Method
  // User findByUsername(String username);
  // User findUser(String username);
  // User findByUsername(String name);

  // Query Override
  @Query("SELECT u from User u WHERE u.name LIKE %:name%")
  List<User> filtrarPorNome(@Param("name") String name);
}
