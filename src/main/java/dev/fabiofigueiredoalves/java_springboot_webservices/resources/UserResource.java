package dev.fabiofigueiredoalves.java_springboot_webservices.resources;

import dev.fabiofigueiredoalves.java_springboot_webservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Maria", "maria@gmail.com", "999999999", "123456");
        return ResponseEntity.ok().body(user);
    }

}
