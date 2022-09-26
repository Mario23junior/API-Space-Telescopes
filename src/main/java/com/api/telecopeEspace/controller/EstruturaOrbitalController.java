package com.api.telecopeEspace.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.telecopeEspace.dto.EspecificacaoOrbitalDTO;
import com.api.telecopeEspace.service.EspecificacaoOrbitalService;

@RestController
@RequestMapping("/v1/api/estruturaOrbital/")
public class EstruturaOrbitalController {

	private EspecificacaoOrbitalService service;

	public EstruturaOrbitalController(EspecificacaoOrbitalService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<EspecificacaoOrbitalDTO> saveTelescop(@RequestBody EspecificacaoOrbitalDTO proDto) {
		return service.savePro(proDto);
	}

	@GetMapping("{id}")
	public ResponseEntity<EspecificacaoOrbitalDTO> listId(@PathVariable Long id) {
		return service.listId(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<EspecificacaoOrbitalDTO> update(@PathVariable Long id,
			@RequestBody EspecificacaoOrbitalDTO propriEstruDto) {
		return service.updatePropri(id, propriEstruDto);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<EspecificacaoOrbitalDTO> listDelete(@PathVariable Long id) {
		return service.delete(id);
	}

}
