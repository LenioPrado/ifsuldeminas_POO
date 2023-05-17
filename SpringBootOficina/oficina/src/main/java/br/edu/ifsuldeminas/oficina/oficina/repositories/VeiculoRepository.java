package br.edu.ifsuldeminas.oficina.oficina.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsuldeminas.oficina.oficina.models.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    
    public Veiculo findByPlaca(String placa);

    public List<Veiculo> findByNumeroChassi(String chassi);
}
