package com.api.telecopeEspace.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.telecopeEspace.utils.CargaDateBase;

@Configuration
@Profile("dev")
public class CargaDate {
  
	@Autowired
	private CargaDateBase bdServiceCarga;
	
	@Bean
	public void CargaBaseFont() {
		this.bdServiceCarga.dbasecarga();
	}
}
