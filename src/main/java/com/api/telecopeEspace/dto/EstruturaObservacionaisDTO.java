package com.api.telecopeEspace.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EstruturaObservacionaisDTO {
    
	private Long id;
	private String massaDeLacamento;
	private Double potenciaEletrica;
	private String geracaoDeEnergia;
	private String comprimentoDeOndas;
	
	private TelescopeSpaceDTO telescopeSpaceDto;

	
	public EstruturaObservacionaisDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMassaDeLacamento() {
		return massaDeLacamento;
	}

	public void setMassaDeLacamento(String massaDeLacamento) {
		this.massaDeLacamento = massaDeLacamento;
	}

	public double getPotenciaEletrica() {
		return potenciaEletrica;
	}

	public void setPotenciaEletrica(double potenciaEletrica) {
		this.potenciaEletrica = potenciaEletrica;
	}

	public String getGeracaoDeEnergia() {
		return geracaoDeEnergia;
	}

	public void setGeracaoDeEnergia(String geracaoDeEnergia) {
		this.geracaoDeEnergia = geracaoDeEnergia;
	}

	public String getComprimentoDeOndas() {
		return comprimentoDeOndas;
	}

	public void setComprimentoDeOndas(String comprimentoDeOndas) {
		this.comprimentoDeOndas = comprimentoDeOndas;
	}

	@JsonIgnore
	public TelescopeSpaceDTO getTelescopeSpaceDto() {
		return telescopeSpaceDto;
	}

	public void setTelescopeSpaceDto(TelescopeSpaceDTO telescopeSpaceDto) {
		this.telescopeSpaceDto = telescopeSpaceDto;
	}

	public void setPotenciaEletrica(Double potenciaEletrica) {
		this.potenciaEletrica = potenciaEletrica;
	}
	
	
	
	
}
