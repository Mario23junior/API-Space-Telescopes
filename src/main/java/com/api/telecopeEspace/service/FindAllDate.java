package com.api.telecopeEspace.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.api.telecopeEspace.dto.TelescopeSpaceDTO;
import com.api.telecopeEspace.model.TelescopeSpace;
import com.api.telecopeEspace.repository.TelescopeSpaceRepository;

@Service
public class FindAllDate {
   
	private TelescopeSpaceRepository repository;
	private ModelMapper mapper;
	
	public FindAllDate(TelescopeSpaceRepository repository, ModelMapper mapper) {
 		this.repository = repository;
		this.mapper = mapper;
	}
	
	public List<TelescopeSpaceDTO> listAllDate() {
		return ((List<TelescopeSpace>) repository
				  .findAll())
				  .stream()
				  .map(this::ConverterEntity)
				  .collect(Collectors.toList());
		          
	}
	
	public TelescopeSpaceDTO ConverterEntity(TelescopeSpace telescopeSpace) {
		mapper.getConfiguration()
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		
		TelescopeSpaceDTO telesSpaceDto = mapper.map(telescopeSpace, TelescopeSpaceDTO.class);
		return telesSpaceDto;
	}
	
	public List<TelescopeSpaceDTO> listAllDto() {
		List<TelescopeSpaceDTO> list = listAllDate();
		return list.stream().collect(Collectors.toList());
	}
	
}
