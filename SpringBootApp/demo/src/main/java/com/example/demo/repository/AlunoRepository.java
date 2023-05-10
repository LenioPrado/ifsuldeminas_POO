package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Aluno;
import java.util.List;


public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    List<Aluno> findByMatricula(String matricula);
}
