package dio.aulamysql;

import java.util.List;

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
    // insertUser("Leonardo", "leonardo", "password");
    // insertUser("Mariana", "mariana", "password");
    // insertUser("Gerusa", "Gerusa", "password");
    // insertUser("Antonella", "Antonella", "password");
    // insertUser("Maria Melo", "mariamelo", "password");
    // insertUser("Maria Maria", "mariamaria", "password");

    // listUsers();
    listUsersByName("Maria");
    findByNameContain("Anton");
  }

  public void insertUser(String name, String userName, String password) {
    User user = new User();
    user.setName(name);
    user.setUserName(userName);
    user.setPassword(password);

    repository.save(user);

  }

  public void listUsers() {
    List<User> users = repository.findAll();

    for (User u : users) {
      System.out.println(u);
    }
  }

  public void listUsersByName(String name) {
    List<User> users = repository.filtrarPorNome(name);

    for (User u : users) {
      System.out.println(u);
    }
  }

  public void findByNameContain(String name) {
    List<User> users = repository.findByNameContaining(name);

    for (User u : users) {
      System.out.println(u);
    }
  }
}
