package com.api.telecopeEspace.utils;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.api.telecopeEspace.model.EspecificacaoOrbital;
import com.api.telecopeEspace.model.EstruturaObservacionais;
import com.api.telecopeEspace.model.PropriedadeEstruturais;
import com.api.telecopeEspace.model.TelescopeSpace;
import com.api.telecopeEspace.repository.TelescopeSpaceRepository;

@Service
public class CargaDateBase {

	private TelescopeSpaceRepository repository;
	private ModelMapper mapper;

	public CargaDateBase(TelescopeSpaceRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	public void dbasecarga() {
		

		EstruturaObservacionais eo1 = new EstruturaObservacionais();
		eo1.setId(1l);
		eo1.setMassaDeLacamento("11.10");
		eo1.setPotenciaEletrica(1.800);
		eo1.setGeracaoDeEnergia("Painéis solares fotovoltaicos");
		eo1.setComprimentoDeOndas("Luz visível, raios gama, raios-X, infravermelho");
 		
		PropriedadeEstruturais p1 = new PropriedadeEstruturais();
		p1.setId(1l);
		p1.setComprimento(13.2);
		p1.setApoastro(541.4);
		p1.setDiametro(4.2);
		p1.setPeriastro(537.4);
		p1.setDistanciaFocal(57.6);

		EspecificacaoOrbital e1 = new EspecificacaoOrbital();
		e1.setId(1l);
		e1.setDecaimento("2030,2040");
		e1.setExcentricidadeOrbital(0.0002657);
		e1.setReferenciaOrbital("Geocêntrica");
		e1.setPeriodoOrbital("95.47");
		e1.setInclinacaoOrbital(28.47);

		TelescopeSpace t1 = new TelescopeSpace();
		t1.setId(1l);
		t1.setNome("Hubble");
		t1.setImg("https://upload.wikimedia.org/wikipedia/commons/3/3f/HST-SM4.jpeg");
		t1.setTipo("Satélite");
		t1.setMissao("Por intermédio do telescópio espacial Hubble, pretende-se investigar a composição e características físicas de corpos celestes, observar galáxias e estrelas para entender melhor a sua formação e levantar dados para a compreensão da história e evolução do Universo.");
		t1.setDurationMissao("32 anos");
		t1.setDataDelancamento("24/04/1990");
		t1.setStatus("ativo");
		t1.setEstruturaObservacionais(Arrays.asList(eo1));
		t1.setPropriedadeEstruturais(Arrays.asList(p1));
 		t1.setEspecificacaoOrbital(Arrays.asList(e1));
 		
 		repository.saveAll(Arrays.asList(t1));
 		

	}
}