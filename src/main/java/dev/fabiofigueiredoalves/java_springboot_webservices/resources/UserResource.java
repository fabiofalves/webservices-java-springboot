package dev.fabiofigueiredoalves.java_springboot_webservices.resources;

import dev.fabiofigueiredoalves.java_springboot_webservices.entities.User;
import dev.fabiofigueiredoalves.java_springboot_webservices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> userList = userService.findAll();
        return ResponseEntity.ok().body(userList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findbyId(@PathVariable Long id){
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

}
