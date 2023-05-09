package br.com.tarefasdb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarefasdb.domain.Tarefas;
import br.com.tarefasdb.repository.TarefasdbRepository;

@RestController
public class TarefasController {
	
	@Autowired
	private TarefasdbRepository tf;
	
	@GetMapping("/tarefas/listar")
	public List<Tarefas> listar(){
		return tf.findAll();		
	}
	
	@PostMapping("/tarefas/cadastrar")
	public String cadastrar(@RequestBody Tarefas ta) {
		String msg="";
		tf.save(ta);
		msg = "Tarefa Cadastrada com Sucesso!";
		return msg;
	}
	@GetMapping("/tarefas/titulo")
	public List<Tarefas> ListarTitulo(@RequestParam String titulo){
		return tf.findByTitulo(titulo);
	}
	@GetMapping("/tarefas/estado")
	public List<Tarefas> ListarEstado(@RequestParam String estado){
		return tf.findByEstado(estado);
	}
	
	@PutMapping("/tarefas/atualizar/{id}")
	public String atualizar(@PathVariable Integer id, @RequestBody Tarefas tarefas) {
		String msg ="";
		Optional<Tarefas> t = tf.findById(id);
		
		if(t.isPresent()) {
			tarefas.setIdtarefas(id);
			tf.save(tarefas);
			msg = "Tarefa Atualizada";
		}
		else {
			msg = "Tarefa não encontrada";
		}
		return msg;
	}
	
}