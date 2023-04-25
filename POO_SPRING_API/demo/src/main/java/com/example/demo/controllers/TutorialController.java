package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Tutorial;
import com.example.demo.repositories.TutorialRepository;

@RestController
@RequestMapping("/api")
public class TutorialController {
    
    @Autowired
    TutorialRepository repository;

    public TutorialController(){
       
    }

    @GetMapping("/tutorial")
    public List<Tutorial> getInformations(){
        return repository.findAll();   
    }

    @PostMapping("/tutorial")
    public void addInformation(@RequestBody Tutorial tutorial){
        repository.save(tutorial);
    }

    @PutMapping("/tutorial/{indice}")
    public void updateInformation(@PathVariable("indice") long indice, @RequestBody Tutorial tutorial){
        Optional<Tutorial> tutorialData = repository.findById(indice);
        
        if (tutorialData.isPresent()) {
            Tutorial t = tutorialData.get();
            t.setName(tutorial.getName());
            t.setDescription(tutorial.getDescription());
            t.setTitle(tutorial.getTitle());
            t.setPublished(tutorial.isPublished());
            repository.save(t);
        }
        
    }

    @DeleteMapping("/tutorial/{indice}")
    public void deleteInformation(@PathVariable("indice") long indice){
        Optional<Tutorial> tutorialData = repository.findById(indice);
        
        if (tutorialData.isPresent()) {
            repository.delete(tutorialData.get());
        }
    }
} 
