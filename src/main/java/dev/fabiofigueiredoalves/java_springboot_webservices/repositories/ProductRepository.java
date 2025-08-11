package dev.fabiofigueiredoalves.java_springboot_webservices.repositories;

import dev.fabiofigueiredoalves.java_springboot_webservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
