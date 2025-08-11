package dev.fabiofigueiredoalves.java_springboot_webservices.repositories;

import dev.fabiofigueiredoalves.java_springboot_webservices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
