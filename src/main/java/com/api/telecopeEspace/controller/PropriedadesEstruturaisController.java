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

import com.api.telecopeEspace.dto.PropriedadeEstruturaisDTO;
import com.api.telecopeEspace.service.PropriedadeEstruturaisService;

@RestController
@RequestMapping("/v1/api/propriedadesestruturais/")
public class PropriedadesEstruturaisController {

	private PropriedadeEstruturaisService service;

	public PropriedadesEstruturaisController(PropriedadeEstruturaisService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<PropriedadeEstruturaisDTO> saveTelescop(@RequestBody PropriedadeEstruturaisDTO proDto) {
		return service.savePro(proDto);
	}

	@GetMapping("{id}")
	public ResponseEntity<PropriedadeEstruturaisDTO> listId(@PathVariable Long id) {
		return service.listId(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<PropriedadeEstruturaisDTO> update(@PathVariable Long id,
			@RequestBody PropriedadeEstruturaisDTO propriEstruDto) {
		return service.updatePropri(id, propriEstruDto);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<PropriedadeEstruturaisDTO> listDelete(@PathVariable Long id) {
		return service.delete(id);
	}

}
