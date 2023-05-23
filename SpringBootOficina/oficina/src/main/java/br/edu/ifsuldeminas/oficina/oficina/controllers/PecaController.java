package br.edu.ifsuldeminas.oficina.oficina.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    // @PostMapping("/peca")
    // public ResponseEntity<?> postVeiculo(@RequestBody Peca veiculo){
      
    //     if (veiculo == null) {
    //         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não é possível efetuar POST de um objeto NULO.");
    //     }
    //     try {
    //         Peca veiculoSalvo = repository.save(veiculo);
    //         return new ResponseEntity<Veiculo>(veiculoSalvo, HttpStatus.CREATED);

    //     } catch (Exception e) {
    //         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ocorreu um erro: " + e.getMessage());
    //     }            
    // }
}
