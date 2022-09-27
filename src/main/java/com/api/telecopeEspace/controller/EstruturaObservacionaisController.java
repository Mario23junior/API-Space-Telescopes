package com.api.telecopeEspace.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.telecopeEspace.dto.EstruturaObservacionaisDTO;
import com.api.telecopeEspace.service.EstruturaObservacionaisService;

@RestController
@RequestMapping("/v1/api/estruturaobservacionais/")
public class EstruturaObservacionaisController {
   
	private EstruturaObservacionaisService service;
	
	public EstruturaObservacionaisController(EstruturaObservacionaisService service) {
	  this.service = service;
	}
	
	@GetMapping
	public List<EstruturaObservacionaisDTO> listAllDate() {
		return service.listAllDate();
	}
	
	@PostMapping
	public ResponseEntity<EstruturaObservacionaisDTO> saveTelescop(@RequestBody EstruturaObservacionaisDTO proDto) {
		return service.savestruturaObser(proDto);
	}

	@GetMapping("{id}")
	public ResponseEntity<EstruturaObservacionaisDTO> listId(@PathVariable Long id) {
		return service.listId(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<EstruturaObservacionaisDTO> update(@PathVariable Long id,
			@RequestBody EstruturaObservacionaisDTO propriEstruDto) {
		return service.updateEstruObser(id, propriEstruDto);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<EstruturaObservacionaisDTO> listDelete(@PathVariable Long id) {
		return service.delete(id);
	}
} 
