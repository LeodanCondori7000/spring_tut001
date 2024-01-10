package com.leodan.springboot.di.app.springbootdi2.services;

import java.util.List;
import java.util.stream.Collectors;

import com.leodan.springboot.di.app.springbootdi2.models.Product;
import com.leodan.springboot.di.app.springbootdi2.repositories.ProductRepository;

public class ProductService {

  ProductRepository repository = new ProductRepository();

  public List<Product> findAll() {
    // return repository.findAll();
    return repository.findAll().stream().map(p -> {
      Double priceImp = p.getPrice() * 1.25d;
      p.setPrice(priceImp.longValue());
      return p;
    }

    ).collect(Collectors.toList());
  }

  public Product findById(Long id) {
    return repository.findById(id);
  }
}
