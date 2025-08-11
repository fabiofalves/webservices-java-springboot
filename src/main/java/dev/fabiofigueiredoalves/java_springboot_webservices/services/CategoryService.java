package dev.fabiofigueiredoalves.java_springboot_webservices.services;

import dev.fabiofigueiredoalves.java_springboot_webservices.entities.Category;
import dev.fabiofigueiredoalves.java_springboot_webservices.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
    
}
