package cl.bja.springboot.app.crud.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "{NotBlank.product.name}")
    @Size(min = 2, max = 50, message = "{Size.product.name}")
    private String name;
    @NotNull(message = "{NotNull.product.price}")
    @Min(value = 500 , message = "{Min.product.price}")
    private Integer price;
    @NotBlank(message = "{NotBlank.product.description}")
    @Size(min = 2, max = 50, message = "{Size.product.description}")
    private String description;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
