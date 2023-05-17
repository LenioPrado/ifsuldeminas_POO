package br.edu.ifsuldeminas.oficina.oficina.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Veiculo getVeiculoPorId(@PathVariable long codigo){
        Optional<Veiculo> optVeiculo = repository.findById(codigo);

        if(optVeiculo.isPresent()){
            return optVeiculo.get();
        }

        return null;
    }

    @GetMapping("/veiculo/PorPlaca/{placa}")
    public Veiculo getVeiculoPorPlaca(@PathVariable String placa){
        Veiculo veiculo = repository.findByPlaca(placa);

        return veiculo;
    }

    @PostMapping("/veiculo")
    public Veiculo postVeiculo(@RequestBody Veiculo veiculo){
        return repository.save(veiculo);
    }

    @PutMapping("/veiculo/{id}")
    public Veiculo putVeiculo(@PathVariable long id, @RequestBody Veiculo veiculo){
        Veiculo _veiculo = getVeiculoPorId(id);

        if (_veiculo != null) {
            _veiculo.setPlaca(veiculo.getPlaca());
            return repository.save(_veiculo);
        }
        
        return null;
    }
}
