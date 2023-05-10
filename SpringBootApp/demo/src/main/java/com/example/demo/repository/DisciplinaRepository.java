package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Disciplina;

public interface DisciplinaRepository extends CrudRepository<Disciplina, Long> {
    List<Disciplina> findByNome(String qualquerCoisa);
}
