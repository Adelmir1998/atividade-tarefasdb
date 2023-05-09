package br.com.tarefasdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tarefasdb.domain.Tarefas;

public interface TarefasdbRepository extends JpaRepository <Tarefas, Integer> {
	
	public List<Tarefas> findByTitulo(String titulo);
	public List<Tarefas> findByEstado(String estado);
}
