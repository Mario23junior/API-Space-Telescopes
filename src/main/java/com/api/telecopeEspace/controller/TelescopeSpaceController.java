package com.api.telecopeEspace.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
	public ResponseEntity<TelescopeSpaceDTO> saveTelescop(@RequestBody TelescopeSpaceDTO telescopeSpaceDTO){
		return service.saveTelescopeS(telescopeSpaceDTO);
	}
	
	
}
