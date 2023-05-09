package br.com.tarefasdb.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer idtarefas;
	
	@Column(nullable=false)
	private String titulo;
	
	@Column(nullable=false)
	private String descricaotarefas;
	
	@Column(nullable=false)
	private Date datainicio;
	
	@Column(nullable=false)
	private Date datatermino;
	
	@Column(nullable=false)
	private String estado;

	public Tarefas() {
	}

	public Tarefas(Integer idtarefas, String titulo, String descricaotarefas, Date datainicio, Date datatermino,
			String estado) {
		this.idtarefas = idtarefas;
		this.titulo = titulo;
		this.descricaotarefas = descricaotarefas;
		this.datainicio = datainicio;
		this.datatermino = datatermino;
		this.estado = estado;
	}

	public Integer getIdtarefas() {
		return idtarefas;
	}

	public void setIdtarefas(Integer idtarefas) {
		this.idtarefas = idtarefas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricaotarefas() {
		return descricaotarefas;
	}

	public void setDescricaotarefas(String descricaotarefas) {
		this.descricaotarefas = descricaotarefas;
	}

	public Date getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	public Date getDatatermino() {
		return datatermino;
	}

	public void setDatatermino(Date datatermino) {
		this.datatermino = datatermino;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
}
