package com.agriculture.service;

import com.agriculture.entity.Product;
import com.agriculture.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired private ProductRepository productRepo;

    public Product save(Product p){ return productRepo.save(p); }
    public List<Product> findAll(){ return productRepo.findAll(); }
    public void deleteById(Long id){ productRepo.deleteById(id); }
}
