package com.api.telecopeEspace.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TelescopeSpace {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String img;
	private String tipo;
	@Column(length = 3000)
	private String missao;
	private String durationMissao;
	private String dataDelancamento;
	private String status;
	
	@OneToMany(mappedBy = "telescopeSpace",cascade = CascadeType.ALL)
	private List<EspecificacaoOrbital> especificacaoOrbital;
	
	@OneToMany(mappedBy = "telescopeSpace",cascade = CascadeType.ALL)
	private List<EstruturaObservacionais> estruturaObservacionais;
	
	@OneToMany(mappedBy = "telescopeSpace",cascade = CascadeType.ALL)
	private List<PropriedadeEstruturais> propriedadeEstruturais;
	
	public TelescopeSpace() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMissao() {
		return missao;
	}

	public void setMissao(String missao) {
		this.missao = missao;
	}

	public String getDurationMissao() {
		return durationMissao;
	}

	public void setDurationMissao(String durationMissao) {
		this.durationMissao = durationMissao;
	}

	public String getDataDelancamento() {
		return dataDelancamento;
	}

	public void setDataDelancamento(String dataDelancamento) {
		this.dataDelancamento = dataDelancamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<EspecificacaoOrbital> getEspecificacaoOrbital() {
		return especificacaoOrbital;
	}

	public void setEspecificacaoOrbital(List<EspecificacaoOrbital> especificacaoOrbital) {
		this.especificacaoOrbital = especificacaoOrbital;
	}

	public List<EstruturaObservacionais> getEstruturaObservacionais() {
		return estruturaObservacionais;
	}

	public void setEstruturaObservacionais(List<EstruturaObservacionais> estruturaObservacionais) {
		this.estruturaObservacionais = estruturaObservacionais;
	}

	public List<PropriedadeEstruturais> getPropriedadeEstruturais() {
		return propriedadeEstruturais;
	}

	public void setPropriedadeEstruturais(List<PropriedadeEstruturais> propriedadeEstruturais) {
		this.propriedadeEstruturais = propriedadeEstruturais;
	}
	
	
	
	
	
	

}
