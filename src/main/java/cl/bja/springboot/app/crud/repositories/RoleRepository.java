package cl.bja.springboot.app.crud.repositories;

import cl.bja.springboot.app.crud.entities.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
