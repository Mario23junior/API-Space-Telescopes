package com.api.telecopeEspace.service;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.telecopeEspace.dto.TelescopeSpaceDTO;
import com.api.telecopeEspace.model.TelescopeSpace;
import com.api.telecopeEspace.repository.TelescopeSpaceRepository;

@Service
public class TelescopeSpaceService {
   
	private TelescopeSpaceRepository teleRespository;
	private ModelMapper mapper;
	
	public TelescopeSpaceService(TelescopeSpaceRepository teleRespository, ModelMapper mapper) {
 		this.teleRespository = teleRespository;
		this.mapper = mapper;
	}

	public ResponseEntity<TelescopeSpaceDTO> saveTelescopeS(TelescopeSpaceDTO teleDto) {
		TelescopeSpace tele = bodysave(mapper.map(teleDto, TelescopeSpace.class));
		return ResponseEntity
				  .status(HttpStatus.OK)
				  .body(mapper.map(tele, TelescopeSpaceDTO.class));
	}

	public TelescopeSpace bodysave(TelescopeSpace telescopeSpace) {
		return this.teleRespository.save(telescopeSpace);
	}
}
