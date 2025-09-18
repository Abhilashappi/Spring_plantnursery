package com.agriculture.controller;

import com.agriculture.entity.Product;
import com.agriculture.entity.Plant;
import com.agriculture.service.ProductService;
import com.agriculture.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired private ProductService productService;
    @Autowired private PlantService plantService;

    @GetMapping
    public String list(Model model){
        model.addAttribute("products", productService.findAll());
        return "products";
    }

    @GetMapping("/add")
    public String addPage(Model model){
        model.addAttribute("product", new Product());
        model.addAttribute("plants", plantService.findAll());
        return "add-product";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Product product){
        productService.save(product);
        return "redirect:/products";
    }
}
