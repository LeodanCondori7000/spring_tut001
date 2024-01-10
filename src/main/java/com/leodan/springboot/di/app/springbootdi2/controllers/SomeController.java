package com.leodan.springboot.di.app.springbootdi2.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leodan.springboot.di.app.springbootdi2.models.Product;
import com.leodan.springboot.di.app.springbootdi2.services.ProductService;

@RestController
@RequestMapping("/api")
public class SomeController {
  private ProductService service = new ProductService();

  @GetMapping
  public List<Product> list(){return service.findAll();}

  @GetMapping("/{id}")
  public Product show(@PathVariable Long id){
    return service.findById(id);
  }
}
