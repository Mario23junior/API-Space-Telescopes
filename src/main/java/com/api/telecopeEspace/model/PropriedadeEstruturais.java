package com.api.telecopeEspace.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PropriedadeEstruturais {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double comprimento;
	private double diametro;
	private double periastro;
	private double apoastro;
	private double distanciaFocal;
	
	@ManyToOne
	private TelescopeSpace telescopeSpace;

	public PropriedadeEstruturais() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPeriastro() {
		return periastro;
	}

	public void setPeriastro(double periastro) {
		this.periastro = periastro;
	}

	public double getApoastro() {
		return apoastro;
	}

	public void setApoastro(double apoastro) {
		this.apoastro = apoastro;
	}

	public double getDistanciaFocal() {
		return distanciaFocal;
	}

	public void setDistanciaFocal(double distanciaFocal) {
		this.distanciaFocal = distanciaFocal;
	}

	public TelescopeSpace getTelescopeSpace() {
		return telescopeSpace;
	}

	public void setTelescopeSpace(TelescopeSpace telescopeSpace) {
		this.telescopeSpace = telescopeSpace;
	}
	
	

}
