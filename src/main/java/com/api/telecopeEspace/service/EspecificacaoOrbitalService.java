package com.api.telecopeEspace.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.telecopeEspace.dto.EspecificacaoOrbitalDTO;
import com.api.telecopeEspace.exception.ExceptionReturnMessageObjectFailed;
import com.api.telecopeEspace.model.EspecificacaoOrbital;
import com.api.telecopeEspace.repository.EspecificacaoOrbitalRepository;

@Service
public class EspecificacaoOrbitalService {
   
	private EspecificacaoOrbitalRepository repository;
	private ModelMapper mapper;
	
	public EspecificacaoOrbitalService(EspecificacaoOrbitalRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	public List<EspecificacaoOrbitalDTO> listAllDate(){
		List<EspecificacaoOrbital> list = repository.findAll();
		try {			
			return list
					.stream()
					.map(listall -> mapper.map(listall, EspecificacaoOrbitalDTO.class))
					.collect(Collectors.toList());
			
		}catch(ExceptionReturnMessageObjectFailed ex) {
			throw new ExceptionReturnMessageObjectFailed("Erro ao buscar obter aglomerado de dados");
		}
  		
 	}
	
	
	public ResponseEntity<EspecificacaoOrbitalDTO> savePro (EspecificacaoOrbitalDTO especificacaoOrbitalDto) {
		EspecificacaoOrbital estruturaObser = bodysave(mapper.map(especificacaoOrbitalDto, EspecificacaoOrbital.class));
		return ResponseEntity
				  .status(HttpStatus.OK)
				  .body(mapper.map(estruturaObser, EspecificacaoOrbitalDTO.class));
	}

	public EspecificacaoOrbital bodysave(EspecificacaoOrbital especificacaoOrbital) {
		return this.repository.save(especificacaoOrbital);
	}
	
	public ResponseEntity<EspecificacaoOrbitalDTO> listId(Long id){
		Optional<EspecificacaoOrbital> listid = repository.findById(id);
		try {			
			if(listid.isPresent()) {
				return ResponseEntity.ok(mapper.map(listid.get(), EspecificacaoOrbitalDTO.class));
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}catch(ExceptionReturnMessageObjectFailed ex) {
			throw new ExceptionReturnMessageObjectFailed("Erro ao buscar numero de idenficação "+ id);
		}
	}
	
	public ResponseEntity<EspecificacaoOrbitalDTO> updatePropri (Long id, EspecificacaoOrbitalDTO proprieOrbiDto){
		Optional<EspecificacaoOrbital> datafind = repository.findById(id);
		if(datafind.isPresent()) {
			EspecificacaoOrbital p1 = datafind.get();
			
			p1.setDecaimento(proprieOrbiDto.getDecaimento());
			p1.setExcentricidadeOrbital(proprieOrbiDto.getExcentricidadeOrbital());
			p1.setReferenciaOrbital(proprieOrbiDto.getReferenciaOrbital());
			p1.setPeriodoOrbital(proprieOrbiDto.getPeriodoOrbital());
			p1.setInclinacaoOrbital(proprieOrbiDto.getInclinacaoOrbital());
		 
			return ResponseEntity.ok(mapper.map(p1, EspecificacaoOrbitalDTO.class));
		} else {
			throw new ExceptionReturnMessageObjectFailed("Erro ao atualizar dados ");
		}
	}
	
	public ResponseEntity<EspecificacaoOrbitalDTO> delete(Long id) {
		Optional<EspecificacaoOrbital> listid = repository.findById(id);
		 if(listid.isPresent()) {
			 repository.delete(listid.get());
			 return ResponseEntity.ok(mapper.map(listid.get(), EspecificacaoOrbitalDTO.class));
		 } else {
				throw new ExceptionReturnMessageObjectFailed("Erro ao deletar id de identificação "+ id);
		 }
	}

	
	
}
