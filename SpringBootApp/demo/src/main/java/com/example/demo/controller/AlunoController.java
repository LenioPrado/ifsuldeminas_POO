package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Aluno;
import com.example.demo.model.Nota;
import com.example.demo.repository.AlunoRepository;
import com.example.demo.repository.NotaRepository;

@RestController
@RequestMapping("/api")
public class AlunoController {
    
    @Autowired
    AlunoRepository repository;

    @Autowired
    NotaRepository notaRepository;

    @GetMapping("/aluno")
    public ResponseEntity<List<Aluno>> getNotas(){
        try {
			List<Aluno> alunos = new ArrayList<Aluno>();

			repository.findAll().forEach(alunos::add);

			if (alunos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(alunos, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

    @PostMapping("/aluno")
    public ResponseEntity<Aluno> criarAluno(@RequestBody Aluno aluno){
        try {
            aluno.getNotas().forEach(n -> n.setAluno(aluno));          
            
            Aluno _novoAluno = repository.save(aluno);            
                       
            return new ResponseEntity<>(_novoAluno, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Aluno>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/aluno/{id}/nota")
    public ResponseEntity<Aluno> adicionarNota(@PathVariable("id") long id, @RequestBody Nota nota){
        try {
            Optional<Aluno> optAluno = repository.findById(id);
            
            if (optAluno.isPresent()) {
                Aluno aluno = optAluno.get();
                nota.setAluno(aluno);
                notaRepository.save(nota);
                return new ResponseEntity<>(aluno, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            return new ResponseEntity<Aluno>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
