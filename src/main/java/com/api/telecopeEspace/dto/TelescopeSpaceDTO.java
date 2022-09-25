package com.api.telecopeEspace.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TelescopeSpaceDTO {

	private Long id;
	private String nome;
	private String img;
	private String tipo;
	private String missao;
	private String durationMissao;
	private String dataDelancamento;
	private String status;

	
	private List<EspecificacaoOrbitalDTO> especificacaoOrbitalDto;
	private List<EstruturaObservacionaisDTO> estruturaObservacionaisDto;
	private List<PropriedadeEstruturaisDTO> propriedadeEstruturaisDto;

	public TelescopeSpaceDTO() {
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

	
	@JsonIgnore
	public List<EspecificacaoOrbitalDTO> getEspecificacaoOrbitalDto() {
		return especificacaoOrbitalDto;
	}

	public void setEspecificacaoOrbitalDto(List<EspecificacaoOrbitalDTO> especificacaoOrbitalDto) {
		this.especificacaoOrbitalDto = especificacaoOrbitalDto;
	}

	@JsonIgnore
	public List<EstruturaObservacionaisDTO> getEstruturaObservacionaisDto() {
		return estruturaObservacionaisDto;
	}

	public void setEstruturaObservacionaisDto(List<EstruturaObservacionaisDTO> estruturaObservacionaisDto) {
		this.estruturaObservacionaisDto = estruturaObservacionaisDto;
	}

	@JsonIgnore
	public List<PropriedadeEstruturaisDTO> getPropriedadeEstruturaisDto() {
		return propriedadeEstruturaisDto;
	}

	public void setPropriedadeEstruturaisDto(List<PropriedadeEstruturaisDTO> propriedadeEstruturaisDto) {
		this.propriedadeEstruturaisDto = propriedadeEstruturaisDto;
	}

}
