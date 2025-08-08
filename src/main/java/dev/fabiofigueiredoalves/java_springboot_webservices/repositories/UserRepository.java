package dev.fabiofigueiredoalves.java_springboot_webservices.repositories;

import dev.fabiofigueiredoalves.java_springboot_webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
