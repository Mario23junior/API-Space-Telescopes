package com.api.telecopeEspace.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.telecopeEspace.dto.PropriedadeEstruturaisDTO;
import com.api.telecopeEspace.exception.ExceptionReturnMessageObjectFailed;
import com.api.telecopeEspace.model.PropriedadeEstruturais;
import com.api.telecopeEspace.repository.PropriedadeEstruturaisRepository;

@Service
public class PropriedadeEstruturaisService {
   
	private PropriedadeEstruturaisRepository propriEstrReposi;
	private ModelMapper mapper;
	
	public PropriedadeEstruturaisService(PropriedadeEstruturaisRepository propriEstrReposi, ModelMapper mapper) {
 		this.propriEstrReposi = propriEstrReposi;
		this.mapper = mapper;
	}
	
	public List<PropriedadeEstruturaisDTO> listAllDate(){
		List<PropriedadeEstruturais> list = propriEstrReposi.findAll();
 		return list
				.stream()
				.map(listall -> mapper.map(listall, PropriedadeEstruturaisDTO.class))
				.collect(Collectors.toList());
  		
 	}
	
	public ResponseEntity<PropriedadeEstruturaisDTO> savePro (PropriedadeEstruturaisDTO proEstruturaisDto) {
		PropriedadeEstruturais tele = bodysave(mapper.map(proEstruturaisDto, PropriedadeEstruturais.class));
		return ResponseEntity
				  .status(HttpStatus.OK)
				  .body(mapper.map(tele, PropriedadeEstruturaisDTO.class));
	}

	public PropriedadeEstruturais bodysave(PropriedadeEstruturais propriedadeEstruturais) {
		return this.propriEstrReposi.save(propriedadeEstruturais);
	}
	
	public ResponseEntity<PropriedadeEstruturaisDTO> listId(Long id){
		Optional<PropriedadeEstruturais> listid = propriEstrReposi.findById(id);
		 if(listid.isPresent()) {
			 return ResponseEntity.ok(mapper.map(listid.get(), PropriedadeEstruturaisDTO.class));
		 } else {
			throw new ExceptionReturnMessageObjectFailed("Erro ao encontrar dados por favor tente novamente mais tarde");
		 }
	}
	
	public ResponseEntity<PropriedadeEstruturaisDTO> updatePropri (Long id, PropriedadeEstruturaisDTO proprieEstruDto){
		Optional<PropriedadeEstruturais> datafind = propriEstrReposi.findById(id);
		if(datafind.isPresent()) {
			PropriedadeEstruturais p1 = datafind.get();
			
			p1.setComprimento(proprieEstruDto.getComprimento());
			p1.setDiametro(proprieEstruDto.getDiametro());
			p1.setPeriastro(proprieEstruDto.getPeriastro());
			p1.setApoastro(proprieEstruDto.getApoastro());
			p1.setDistanciaFocal(proprieEstruDto.getDistanciaFocal());

			return ResponseEntity.ok(mapper.map(p1, PropriedadeEstruturaisDTO.class));
		} else {
			throw new ExceptionReturnMessageObjectFailed("Erro ao deletar dados por favor tente novamente mais tarde");
		}
	}
	
	public ResponseEntity<PropriedadeEstruturaisDTO> delete(Long id) {
		Optional<PropriedadeEstruturais> listid = propriEstrReposi.findById(id);
		 if(listid.isPresent()) {
			 propriEstrReposi.delete(listid.get());
			 return ResponseEntity.ok(mapper.map(listid.get(), PropriedadeEstruturaisDTO.class));
		 } else {
				throw new ExceptionReturnMessageObjectFailed("Erro ao deletar dados por favor tente novamente mais tarde");
		 }
	}

}
