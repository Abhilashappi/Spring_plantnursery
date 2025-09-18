package com.agriculture.controller;

import com.agriculture.entity.Plant;
import com.agriculture.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/plants")
public class PlantController {
    @Autowired private PlantService plantService;

    @GetMapping
    public String list(Model model){
        model.addAttribute("plants", plantService.findAll());
        return "plants";
    }

    @GetMapping("/add")
    public String addPage(Model model){
        model.addAttribute("plant", new Plant());
        return "add-plant";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Plant plant){
        plantService.save(plant);
        return "redirect:/plants";
    }
}
