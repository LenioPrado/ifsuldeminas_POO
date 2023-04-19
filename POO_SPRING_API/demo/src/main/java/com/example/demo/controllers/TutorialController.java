package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TutorialController {
    
    @GetMapping("/tutorial")
    public List<String> getInformations(){
        List<String> lista = new ArrayList<String>();
        lista.add("Info1");
        lista.add("Info2");
        lista.add("Info3");
        return lista;
    }
}
