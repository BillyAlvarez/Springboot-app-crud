package cl.bja.springboot.app.crud.repositories;

import cl.bja.springboot.app.crud.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    boolean existsBySku(String sku);
}
