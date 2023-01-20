package dio.aulamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aulamysql.model.User;
import dio.aulamysql.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
  @Autowired
  UserRepository repository;

  @Override
  public void run(String... args) throws Exception {
    User user = new User();
    user.setName("Maria");
    user.setUserName("maria");
    user.setPassword("mariadb");

    repository.save(user);

    for (User u : repository.findAll()) {
      System.out.println(u);
    }
  }

}
