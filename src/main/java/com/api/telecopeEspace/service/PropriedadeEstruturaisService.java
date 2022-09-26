package com.api.telecopeEspace.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.telecopeEspace.dto.PropriedadeEstruturaisDTO;
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
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
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
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<PropriedadeEstruturaisDTO> delete(Long id) {
		Optional<PropriedadeEstruturais> listid = propriEstrReposi.findById(id);
		 if(listid.isPresent()) {
			 propriEstrReposi.delete(listid.get());
			 return ResponseEntity.ok(mapper.map(listid.get(), PropriedadeEstruturaisDTO.class));
		 } else {
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		 }
	}

}
