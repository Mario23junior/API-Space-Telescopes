package com.api.telecopeEspace.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	
	public List<TelescopeSpaceDTO> listAllDate(){
		List<TelescopeSpace> list = teleRespository.findAll();
 		return list
				.stream()
				.map(listall -> mapper.map(listall, TelescopeSpaceDTO.class))
				.collect(Collectors.toList());
  		
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
	
	public ResponseEntity<TelescopeSpaceDTO> listId(Long id){
		Optional<TelescopeSpace> listid = teleRespository.findById(id);
		 if(listid.isPresent()) {
			 return ResponseEntity.ok(mapper.map(listid.get(), TelescopeSpaceDTO.class));
		 } else {
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		 }
	}
	
	public ResponseEntity<TelescopeSpaceDTO> updateTelescope(Long id, TelescopeSpaceDTO telescopeSpDto){
		Optional<TelescopeSpace> datafind = teleRespository.findById(id);
		if(datafind.isPresent()) {
			TelescopeSpace t1 = datafind.get();
			t1.setNome(telescopeSpDto.getNome());
			t1.setImg(telescopeSpDto.getImg());
			t1.setTipo(telescopeSpDto.getTipo());
			t1.setMissao(telescopeSpDto.getMissao());
			t1.setDurationMissao(telescopeSpDto.getDataDelancamento());
			t1.setDataDelancamento(telescopeSpDto.getDataDelancamento());
			t1.setStatus(telescopeSpDto.getStatus());
			
			return ResponseEntity.ok(mapper.map(t1, TelescopeSpaceDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<TelescopeSpaceDTO> delete(Long id) {
		Optional<TelescopeSpace> listid = teleRespository.findById(id);
		 if(listid.isPresent()) {
			 teleRespository.delete(listid.get());
			 return ResponseEntity.ok(mapper.map(listid.get(), TelescopeSpaceDTO.class));
		 } else {
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		 }
	}
	
	
}
