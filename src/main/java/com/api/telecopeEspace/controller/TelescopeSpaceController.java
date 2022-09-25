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

import com.api.telecopeEspace.dto.TelescopeSpaceDTO;
import com.api.telecopeEspace.service.TelescopeSpaceService;

@RestController
@RequestMapping("/v1/api/telescopespace/")
public class TelescopeSpaceController {

	private TelescopeSpaceService service;

	public TelescopeSpaceController(TelescopeSpaceService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<TelescopeSpaceDTO> saveTelescop(@RequestBody TelescopeSpaceDTO telescopeSpaceDTO) {
		return service.saveTelescopeS(telescopeSpaceDTO);
	}

	@GetMapping("{id}")
	public ResponseEntity<TelescopeSpaceDTO> listId(@PathVariable Long id) {
		return service.listId(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<TelescopeSpaceDTO> update(@PathVariable Long id, @RequestBody TelescopeSpaceDTO telesDto) {
		return service.updateTelescope(id, telesDto);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<TelescopeSpaceDTO> listDelete(@PathVariable Long id) {
		return service.delete(id);
	}
}
