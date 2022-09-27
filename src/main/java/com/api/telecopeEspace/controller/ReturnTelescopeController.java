package com.api.telecopeEspace.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.telecopeEspace.dto.TelescopeSpaceDTO;
import com.api.telecopeEspace.service.FindAllDate;

@RestController
@RequestMapping("/v1/api/base/telescope/")
public class ReturnTelescopeController {

	private FindAllDate service;

	public ReturnTelescopeController(FindAllDate service) {
		this.service = service;
	}

	@GetMapping
	public List<TelescopeSpaceDTO> listAllBase() {
		return service.listAllDto();
	}
}
