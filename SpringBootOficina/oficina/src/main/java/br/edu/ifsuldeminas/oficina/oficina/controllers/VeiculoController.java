package br.edu.ifsuldeminas.oficina.oficina.controllers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InvalidClassException;
import java.util.List;
import java.util.Optional;

import javax.management.InvalidApplicationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.exc.InvalidNullException;

import br.edu.ifsuldeminas.oficina.oficina.models.Veiculo;
import br.edu.ifsuldeminas.oficina.oficina.repositories.VeiculoRepository;

@RestController
@RequestMapping("/api")
public class VeiculoController {
    
    @Autowired
    private VeiculoRepository repository;

    @GetMapping("/veiculo")
    public List<Veiculo> getVeiculos(){
        return repository.findAll();
    }

    @GetMapping("/veiculo/{codigo}")
    public ResponseEntity<Veiculo> getVeiculoPorId(@PathVariable long codigo){
        Optional<Veiculo> optVeiculo = repository.findById(codigo);

        if(optVeiculo.isPresent()){
            return new ResponseEntity<Veiculo>(optVeiculo.get(), HttpStatus.OK);
        }

        return new ResponseEntity<Veiculo>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/veiculo/PorPlaca/{placa}")
    public ResponseEntity<Veiculo> getVeiculoPorPlaca(@PathVariable String placa){
        Veiculo veiculo = repository.findByPlaca(placa);
        if (veiculo == null) {
            return new ResponseEntity<Veiculo>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Veiculo>(veiculo, HttpStatus.OK);
    }

    @PostMapping("/veiculo")
    public ResponseEntity<?> postVeiculo(@RequestBody Veiculo veiculo){
      
        if (veiculo == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não é possível efetuar POST de um objeto NULO.");
        }
        try {
            Veiculo veiculoSalvo = repository.save(veiculo);
            return new ResponseEntity<Veiculo>(veiculoSalvo, HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ocorreu um erro: " + e.getMessage());
        }            
    }

    @PutMapping("/veiculo/{id}")
    public ResponseEntity<Veiculo> putVeiculo(@PathVariable long id, @RequestBody Veiculo veiculo){
        Optional<Veiculo> optVeiculo = repository.findById(id);

        if (optVeiculo.isPresent()) {
            Veiculo veiculoRepo = optVeiculo.get();
            veiculoRepo.setPlaca(veiculoRepo.getPlaca());
            veiculoRepo.setAno(veiculoRepo.getAno());
            veiculoRepo.setModelo(veiculoRepo.getModelo());
            veiculoRepo.setNumeroChassi(veiculoRepo.getNumeroChassi());
            veiculoRepo.setCor(veiculoRepo.getCor());
            veiculoRepo.setKmRodados(veiculoRepo.getKmRodados());
            return new ResponseEntity<Veiculo>(repository.save(veiculoRepo), HttpStatus.ACCEPTED);
        }
        
        return new ResponseEntity<Veiculo>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/veiculo/{placa}")
    public ResponseEntity<Veiculo> deletVeiculo(@PathVariable String placa){
        Veiculo veiculo = repository.findByPlaca(placa);

        if (veiculo != null) {
            repository.delete(veiculo);
            return new ResponseEntity<Veiculo>(HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<Veiculo>(HttpStatus.BAD_REQUEST);
    }
}
