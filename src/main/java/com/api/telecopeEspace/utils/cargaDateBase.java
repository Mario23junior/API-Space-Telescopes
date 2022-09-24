package com.api.telecopeEspace.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.api.telecopeEspace.repository.TelescopeSpaceRepository;

@Service
public class cargaDateBase {
   
	private TelescopeSpaceRepository repository;
	private ModelMapper mapper;
	
	public cargaDateBase(TelescopeSpaceRepository repository, ModelMapper mapper) {
		super();
		this.repository = repository;
		this.mapper = mapper;
	}
	
	public void dbasecarga() {
		
	}	
}