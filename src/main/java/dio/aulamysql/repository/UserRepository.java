package dio.aulamysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.aulamysql.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
