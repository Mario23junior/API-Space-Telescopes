package com.api.telecopeEspace.dto;

public class EspecificacaoOrbitalDTO {

	private Long id;
	private String decaimento;
	private double excentricidadeOrbital;
	private String referenciaOrbital;
	private String periodoOrbital;
	private Double inclinacaoOrbital;
	
	private TelescopeSpaceDTO telescopeSpaceDto;

	public EspecificacaoOrbitalDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDecaimento() {
		return decaimento;
	}

	public void setDecaimento(String decaimento) {
		this.decaimento = decaimento;
	}

	public double getExcentricidadeOrbital() {
		return excentricidadeOrbital;
	}

	public void setExcentricidadeOrbital(double excentricidadeOrbital) {
		this.excentricidadeOrbital = excentricidadeOrbital;
	}

	public String getReferenciaOrbital() {
		return referenciaOrbital;
	}

	public void setReferenciaOrbital(String referenciaOrbital) {
		this.referenciaOrbital = referenciaOrbital;
	}

	public String getPeriodoOrbital() {
		return periodoOrbital;
	}

	public void setPeriodoOrbital(String periodoOrbital) {
		this.periodoOrbital = periodoOrbital;
	}

	public Double getInclinacaoOrbital() {
		return inclinacaoOrbital;
	}

	public void setInclinacaoOrbital(Double inclinacaoOrbital) {
		this.inclinacaoOrbital = inclinacaoOrbital;
	}

	public TelescopeSpaceDTO getTelescopeSpaceDto() {
		return telescopeSpaceDto;
	}

	public void setTelescopeSpaceDto(TelescopeSpaceDTO telescopeSpaceDto) {
		this.telescopeSpaceDto = telescopeSpaceDto;
	}
	
	

}
