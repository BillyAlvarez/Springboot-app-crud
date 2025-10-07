package cl.bja.springboot.app.crud.services;

import cl.bja.springboot.app.crud.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);
}
