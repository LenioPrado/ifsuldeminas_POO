package br.edu.ifsuldeminas.oficina.oficina.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsuldeminas.oficina.oficina.models.Peca;

@RestController
@RequestMapping("/api")
public class PecaController {
    
    @GetMapping("/peca")
    public List<Peca> getPecas(){
        return new ArrayList<Peca>();
    }
}
