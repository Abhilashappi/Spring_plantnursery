package com.agriculture.service;

import com.agriculture.entity.Plant;
import com.agriculture.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService {
    @Autowired private PlantRepository plantRepo;

    public Plant save(Plant p){ return plantRepo.save(p); }
    public List<Plant> findAll(){ return plantRepo.findAll(); }
    public Plant findById(Long id){ return plantRepo.findById(id).orElse(null); }
    public void deleteById(Long id){ plantRepo.deleteById(id); }
}
