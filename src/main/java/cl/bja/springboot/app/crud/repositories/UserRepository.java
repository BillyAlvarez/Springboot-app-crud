package cl.bja.springboot.app.crud.repositories;

import cl.bja.springboot.app.crud.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
