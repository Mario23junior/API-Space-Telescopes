package com.api.telecopeEspace.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EstruturaObservacionais {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String massaDeLacamento;
	private Double potenciaEletrica;
	private String geracaoDeEnergia;
	private String comprimentoDeOndas;
	
	@ManyToOne
	private TelescopeSpace telescopeSpace;
	
	public EstruturaObservacionais() {
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

	public TelescopeSpace getTelescopeSpace() {
		return telescopeSpace;
	}

	public void setTelescopeSpace(TelescopeSpace telescopeSpace) {
		this.telescopeSpace = telescopeSpace;
	}

	public void setPotenciaEletrica(Double potenciaEletrica) {
		this.potenciaEletrica = potenciaEletrica;
	}
	
	
	
}
