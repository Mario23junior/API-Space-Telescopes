package com.api.telecopeEspace.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.telecopeEspace.dto.EstruturaObservacionaisDTO;
import com.api.telecopeEspace.exception.ExceptionReturnMessageObjectFailed;
import com.api.telecopeEspace.model.EstruturaObservacionais;
import com.api.telecopeEspace.repository.EstruturaObservacionaisRepository;

@Service
public class EstruturaObservacionaisService {
  
	private EstruturaObservacionaisRepository repository;
	private ModelMapper mapper;
	
	public EstruturaObservacionaisService(EstruturaObservacionaisRepository repository, ModelMapper mapper) {
 		this.repository = repository;
		this.mapper = mapper;
	}
	
	public List<EstruturaObservacionaisDTO> listAllDate(){
		try {
		List<EstruturaObservacionais> list = repository.findAll();
			return list
					.stream()
					.map(listall -> mapper.map(listall, EstruturaObservacionaisDTO.class))
					.collect(Collectors.toList());
		} catch(ExceptionReturnMessageObjectFailed ex) {
			throw new ExceptionReturnMessageObjectFailed("Erro ao encontrar dados por favor tente novamente mais tarde");
		}
 		
 	}
	
	public ResponseEntity<EstruturaObservacionaisDTO> savestruturaObser (EstruturaObservacionaisDTO proEsturaObserDto) {
		EstruturaObservacionais tele = bodysave(mapper.map(proEsturaObserDto, EstruturaObservacionais.class));
		return ResponseEntity
				  .status(HttpStatus.OK)
				  .body(mapper.map(tele, EstruturaObservacionaisDTO.class));
	}
	
	public EstruturaObservacionais bodysave(EstruturaObservacionais estruturaObservacionais) {
		return this.repository.save(estruturaObservacionais);
	}
	
	public ResponseEntity<EstruturaObservacionaisDTO> listId(Long id){
		Optional<EstruturaObservacionais> listid = repository.findById(id);
		 if(listid.isPresent()) {
			 return ResponseEntity.ok(mapper.map(listid.get(), EstruturaObservacionaisDTO.class));
		 } else {
				throw new ExceptionReturnMessageObjectFailed("Id "+id+" não encontrado");
		 }
	}
	
	public ResponseEntity<EstruturaObservacionaisDTO> updateEstruObser (Long id, EstruturaObservacionaisDTO propriEstruDto){
		Optional<EstruturaObservacionais> datafind = repository.findById(id);
		if(datafind.isPresent()) {
			EstruturaObservacionais e1 = datafind.get();
		
 			e1.setMassaDeLacamento(propriEstruDto.getMassaDeLacamento());
 			e1.setPotenciaEletrica(propriEstruDto.getPotenciaEletrica());
 			e1.setGeracaoDeEnergia(propriEstruDto.getGeracaoDeEnergia());
 			e1.setComprimentoDeOndas(propriEstruDto.getGeracaoDeEnergia());
		 
			return ResponseEntity.ok(mapper.map(e1, EstruturaObservacionaisDTO.class));
		} else {
			throw new ExceptionReturnMessageObjectFailed("Erro ao atualiza, o id "+id+" não encontrado");
		}
	}
	
	public ResponseEntity<EstruturaObservacionaisDTO> delete(Long id) {
		Optional<EstruturaObservacionais> listid = repository.findById(id);
		 if(listid.isPresent()) {
			 repository.delete(listid.get());
			 return ResponseEntity.ok(mapper.map(listid.get(), EstruturaObservacionaisDTO.class));
		 } else {
				throw new ExceptionReturnMessageObjectFailed("Erro ao deletar o id "+ id);
		 }
	}
	
	
	
}
