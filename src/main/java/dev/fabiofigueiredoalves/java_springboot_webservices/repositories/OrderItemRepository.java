package dev.fabiofigueiredoalves.java_springboot_webservices.repositories;

import dev.fabiofigueiredoalves.java_springboot_webservices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
