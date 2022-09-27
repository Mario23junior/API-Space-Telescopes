package com.api.telecopeEspace.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PropriedadeEstruturaisDTO {

	private Long id;
	private double comprimento;
	private double diametro;
	private double periastro;
	private double apoastro;
	private double distanciaFocal;
	
	private TelescopeSpaceDTO telescopeSpaceDto;

	public PropriedadeEstruturaisDTO() {
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

	@JsonIgnore
	public TelescopeSpaceDTO getTelescopeSpaceDto() {
		return telescopeSpaceDto;
	}

	public void setTelescopeSpaceDto(TelescopeSpaceDTO telescopeSpaceDto) {
		this.telescopeSpaceDto = telescopeSpaceDto;
	}

}
