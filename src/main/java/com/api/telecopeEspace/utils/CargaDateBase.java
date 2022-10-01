package com.api.telecopeEspace.utils;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.api.telecopeEspace.dto.EspecificacaoOrbitalDTO;
import com.api.telecopeEspace.dto.EstruturaObservacionaisDTO;
import com.api.telecopeEspace.dto.PropriedadeEstruturaisDTO;
import com.api.telecopeEspace.dto.TelescopeSpaceDTO;
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

		TelescopeSpaceDTO ts = new TelescopeSpaceDTO();
		ts.setId(1l);

		EstruturaObservacionaisDTO eo1 = new EstruturaObservacionaisDTO();
		eo1.setId(1l);
		eo1.setMassaDeLacamento("11.10");
		eo1.setPotenciaEletrica(1.800);
		eo1.setGeracaoDeEnergia("Painéis solares fotovoltaicos");
		eo1.setComprimentoDeOndas("Luz visível, raios gama, raios-X, infravermelho");
		eo1.setTelescopeSpaceDto(ts);

		PropriedadeEstruturaisDTO p1 = new PropriedadeEstruturaisDTO();
		p1.setId(1l);
		p1.setComprimento(13.2);
		p1.setApoastro(541.4);
		p1.setDiametro(4.2);
		p1.setPeriastro(537.4);
		p1.setDistanciaFocal(57.6);
		p1.setTelescopeSpaceDto(ts);

		EspecificacaoOrbitalDTO e1 = new EspecificacaoOrbitalDTO();
		e1.setId(1l);
		e1.setDecaimento("2030,2040");
		e1.setExcentricidadeOrbital(0.0002657);
		e1.setReferenciaOrbital("Geocêntrica");
		e1.setPeriodoOrbital("95.47");
		e1.setInclinacaoOrbital(28.47);
		e1.setTelescopeSpaceDto(ts);

		TelescopeSpaceDTO t1 = new TelescopeSpaceDTO();
		t1.setId(1l);
		t1.setNome("Hubble");
		t1.setImg("https://upload.wikimedia.org/wikipedia/commons/3/3f/HST-SM4.jpeg");
		t1.setTipo("Satélite");
		t1.setMissao(
				"Por intermédio do telescópio espacial Hubble, pretende-se investigar a composição e características físicas de corpos celestes, observar galáxias e estrelas para entender melhor a sua formação e levantar dados para a compreensão da história e evolução do Universo.");
		t1.setDurationMissao("32 anos");
		t1.setDataDelancamento("24/04/1990");
		t1.setStatus("ativo");
		t1.setEstruturaObservacionaisDto(Arrays.asList(eo1));
		t1.setPropriedadeEstruturaisDto(Arrays.asList(p1));
		t1.setEspecificacaoOrbitalDto(Arrays.asList(e1));

		TelescopeSpaceDTO ts2 = new TelescopeSpaceDTO();
		ts2.setId(5l);

		EstruturaObservacionaisDTO eo2 = new EstruturaObservacionaisDTO();
		eo2.setId(5l);
		eo2.setMassaDeLacamento("950.00");
		eo2.setPotenciaEletrica(0.0);
		eo2.setGeracaoDeEnergia("Painéis solares fotovoltaicos");
		eo2.setComprimentoDeOndas("silício,arsênico	");
		eo2.setTelescopeSpaceDto(ts2);

		PropriedadeEstruturaisDTO p2 = new PropriedadeEstruturaisDTO();
		p2.setId(5l);
		p2.setComprimento(85.0);
		p2.setApoastro(828.0);
		p2.setDiametro(85.0);
		p2.setPeriastro(63.4);
		p2.setDistanciaFocal(12.0);
		p2.setTelescopeSpaceDto(ts2);

		EspecificacaoOrbitalDTO e2 = new EspecificacaoOrbitalDTO();
		e2.setId(5l);
		e2.setDecaimento("");
		e2.setExcentricidadeOrbital(0.02);
		e2.setReferenciaOrbital("Terra, órbita heliocêntrica");
		e2.setPeriodoOrbital("365");
		e2.setInclinacaoOrbital(1.14);
		e2.setTelescopeSpaceDto(ts2);

		TelescopeSpaceDTO t2 = new TelescopeSpaceDTO();
		t2.setId(5l);
		t2.setNome("Spitzer");
		t2.setImg("https://raumfahrtmissionen.dlr.de/images/Missionsbilder/S/Spitzer_SIRTF_ir_rh_4.jpg");
		t2.setTipo("Telescopio");
		t2.setMissao(
				"Com uma missão inicial de 2,5 anos, o Spitzer deve obter imagens e espectros obtidos pela detecção de radiação infravermelha ou de calor, que os objetos do espaço irradiam no comprimento de ondas entre 3 a 180 micrômetros. 1 micrômetro corresponde a 1 milionésimo de metro.");
		t2.setDurationMissao("16 anos");
		t2.setDataDelancamento("25/06/2003");
		t2.setStatus("desativado");
		t2.setEstruturaObservacionaisDto(Arrays.asList(eo2));
		t2.setPropriedadeEstruturaisDto(Arrays.asList(p2));
		t2.setEspecificacaoOrbitalDto(Arrays.asList(e2));
		
		TelescopeSpaceDTO ts3 = new TelescopeSpaceDTO();
		ts3.setId(9l);

		EstruturaObservacionaisDTO eo3 = new EstruturaObservacionaisDTO();
		eo3.setId(9l);
		eo3.setMassaDeLacamento("53");
		eo3.setPotenciaEletrica(35.00);
		eo3.setGeracaoDeEnergia("Painéis solares fotovoltaicos");
		eo3.setComprimentoDeOndas("");
		eo3.setTelescopeSpaceDto(ts3);

		PropriedadeEstruturaisDTO p3 = new PropriedadeEstruturaisDTO();
		p3.setId(9l);
		p3.setComprimento(0.0);
		p3.setApoastro(129.3968);
		p3.setDiametro(15);
		p3.setPeriastro(101.4);
		p3.setDistanciaFocal(0.0);
		p3.setTelescopeSpaceDto(ts3);

		EspecificacaoOrbitalDTO e3 = new EspecificacaoOrbitalDTO();
		e3.setId(9l);
		e3.setDecaimento("000");
		e3.setExcentricidadeOrbital(0.0010821);
		e3.setReferenciaOrbital("Geocêntrico");
		e3.setPeriodoOrbital("101.4");
		e3.setInclinacaoOrbital(98.7157);
		e3.setTelescopeSpaceDto(ts3);

		TelescopeSpaceDTO t3 = new TelescopeSpaceDTO();
		t3.setId(9l);
		t3.setNome("MOST");
		t3.setImg("https://astro-canada.ca/uploads/a2118-most3-g.jpg");
		t3.setTipo("Telescopio");
		t3.setMissao(
				"O telescópio espacial MOST foi desenvolvido pelo Canadá para estudar microvariabilidade e as oscilações das estrelas.");
		t3.setDurationMissao("15 anos");
		t3.setDataDelancamento("30/06/2003");
		t3.setStatus("ativo");
		t3.setEstruturaObservacionaisDto(Arrays.asList(eo3));
		t3.setPropriedadeEstruturaisDto(Arrays.asList(p3));
		t3.setEspecificacaoOrbitalDto(Arrays.asList(e3));
		
		TelescopeSpaceDTO ts4 = new TelescopeSpaceDTO();
		ts4.setId(13l);

		EstruturaObservacionaisDTO eo4 = new EstruturaObservacionaisDTO();
		eo4.setId(13l);
		eo4.setMassaDeLacamento("4.790");
		eo4.setPotenciaEletrica(2.350);
		eo4.setGeracaoDeEnergia("");
		eo4.setComprimentoDeOndas(" luz visível, raios gama, raios-X e infravermelho");
		eo4.setTelescopeSpaceDto(ts4);

		PropriedadeEstruturaisDTO p4 = new PropriedadeEstruturaisDTO();
		p4.setId(13l);
		p4.setComprimento(0.0);
		p4.setApoastro(134.5276);
		p4.setDiametro(0.0);
		p4.setPeriastro(14.3079);
		p4.setDistanciaFocal(0.0);
		p4.setTelescopeSpaceDto(ts4);

		EspecificacaoOrbitalDTO e4 = new EspecificacaoOrbitalDTO();
		e4.setId(13l);
		e4.setDecaimento("");
		e4.setExcentricidadeOrbital(0.743972);
		e4.setReferenciaOrbital("Geocêntrica , Órbita elíptica alta");
		e4.setPeriodoOrbital("3809.3");
		e4.setInclinacaoOrbital(76.7156);
		e4.setTelescopeSpaceDto(ts4);

		TelescopeSpaceDTO t4 = new TelescopeSpaceDTO();
		t4.setId(13l);
		t4.setNome("raios-X Chandra");
		t4.setImg(
				"https://i0.wp.com/gizmodo.uol.com.br/wp-content/blogs.dir/8/files/2018/10/chandra-nasa.jpg?fit=1260%2C708&ssl=1");
		t4.setTipo("Telescopio");
		t4.setMissao(
				"O Observatório de raios-X Chandra é um telescópio espacial lançado pela NASA e gerenciado pelo Laboratório de Jato-Propulsão. Foi lançado em 23 de julho de 1999, pela missão STS-93 do ônibus espacial Columbia");
		t4.setDurationMissao("");
		t4.setDataDelancamento("");
		t4.setStatus("ativo");
		t4.setEstruturaObservacionaisDto(Arrays.asList(eo4));
		t4.setPropriedadeEstruturaisDto(Arrays.asList(p4));
		t4.setEspecificacaoOrbitalDto(Arrays.asList(e4));
		
		TelescopeSpaceDTO ts5 = new TelescopeSpaceDTO();
		ts5.setId(17l);

		EstruturaObservacionaisDTO eo5 = new EstruturaObservacionaisDTO();
		eo5.setId(17l);
		eo5.setMassaDeLacamento("6.1614");
		eo5.setPotenciaEletrica(2.000);
		eo5.setGeracaoDeEnergia("");
		eo5.setComprimentoDeOndas("Espectro infravermelho");
		eo5.setTelescopeSpaceDto(ts5);

		PropriedadeEstruturaisDTO p5 = new PropriedadeEstruturaisDTO();
		p5.setId(17l);
		p5.setComprimento(0.0);
		p5.setApoastro(1.500000);
		p5.setDiametro(6.5);
		p5.setPeriastro(374.000);
		p5.setDistanciaFocal(3.0);
		p5.setTelescopeSpaceDto(ts5);

		EspecificacaoOrbitalDTO e5 = new EspecificacaoOrbitalDTO();
		e5.setId(17l);
		e5.setDecaimento("");
		e5.setExcentricidadeOrbital(0.0);
		e5.setReferenciaOrbital("1.500.000");
		e5.setPeriodoOrbital("6.0");
		e5.setInclinacaoOrbital(0.0);
		e5.setTelescopeSpaceDto(ts5);

		TelescopeSpaceDTO t5 = new TelescopeSpaceDTO();
		t5.setId(17l);
		t5.setNome("James Webb");
		t5.setImg("https://upload.wikimedia.org/wikipedia/commons/2/2a/JWST_spacecraft_model_3.png");
		t5.setTipo("Telescopio");
		t5.setMissao(
				"O Telescópio Espacial James Webb (em inglês James Webb Space Telescope, JWST) é um telescópio espacial desenvolvido em conjunto pela NASA");
		t5.setDurationMissao("10 anos");
		t5.setDataDelancamento("25/12/2021");
		t5.setStatus("ativo");
		t5.setEstruturaObservacionaisDto(Arrays.asList(eo5));
		t5.setPropriedadeEstruturaisDto(Arrays.asList(p5));
		t5.setEspecificacaoOrbitalDto(Arrays.asList(e5));
		
		TelescopeSpaceDTO ts6 = new TelescopeSpaceDTO();
		ts6.setId(21l);

		EstruturaObservacionaisDTO eo6 = new EstruturaObservacionaisDTO();
		eo6.setId(21l);
		eo6.setMassaDeLacamento("1.0524");
		eo6.setPotenciaEletrica(1.100);
		eo6.setGeracaoDeEnergia("Painéis solares fotovoltaicos");
		eo6.setComprimentoDeOndas("");
		eo6.setTelescopeSpaceDto(ts6);

		PropriedadeEstruturaisDTO p6 = new PropriedadeEstruturaisDTO();
		p6.setId(21l);
		p6.setComprimento(430);
		p6.setApoastro(1.0499);
		p6.setDiametro(2.7);
		p6.setPeriastro(0.97671);
		p6.setDistanciaFocal(0.95);
		p6.setTelescopeSpaceDto(ts6);

		EspecificacaoOrbitalDTO e6 = new EspecificacaoOrbitalDTO();
		e6.setId(21l);
		e6.setDecaimento("");
		e6.setExcentricidadeOrbital(0.036116);
		e6.setReferenciaOrbital("Heliocêntrica");
		e6.setPeriodoOrbital("372.57");
		e6.setInclinacaoOrbital(0.0);
		e6.setTelescopeSpaceDto(ts6);

		TelescopeSpaceDTO t6 = new TelescopeSpaceDTO();
		t6.setId(21l);
		t6.setNome("Kepler");
		t6.setImg(
				"https://astronomynow.com/wp-content/uploads/2016/04/Kepler_K2_640x480.jpg");
		t6.setTipo("Schmidt");
		t6.setMissao(
				"O Telescópio Espacial Kepler consistiu em um observatório espacial projetado pela NASA que procurou por planetas com características habitáveis fora do Sistema Solar por nove anos e meio.");
		t6.setDurationMissao("13 anos");
		t6.setDataDelancamento("07/03/2009");
		t6.setStatus("desativado");
		t6.setEstruturaObservacionaisDto(Arrays.asList(eo6));
		t6.setPropriedadeEstruturaisDto(Arrays.asList(p6));
		t6.setEspecificacaoOrbitalDto(Arrays.asList(e6));
		
		TelescopeSpaceDTO ts7 = new TelescopeSpaceDTO();
		ts7.setId(25l);

		EstruturaObservacionaisDTO eo7 = new EstruturaObservacionaisDTO();
		eo7.setId(25l);
		eo7.setMassaDeLacamento("480");
		eo7.setPotenciaEletrica(0.0);
		eo7.setGeracaoDeEnergia("Painéis solares fotovoltaicos");
		eo7.setComprimentoDeOndas("");
		eo7.setTelescopeSpaceDto(ts7);

		PropriedadeEstruturaisDTO p7 = new PropriedadeEstruturaisDTO();
		p7.setId(25l);
		p7.setComprimento(0.0);
		p7.setApoastro(594.0);
		p7.setDiametro(0.0);
		p7.setPeriastro(575.0);
		p7.setDistanciaFocal(0.0);
		p7.setTelescopeSpaceDto(ts7);

		EspecificacaoOrbitalDTO e7 = new EspecificacaoOrbitalDTO();
		e7.setId(25l);
		e7.setDecaimento("29/03/2003");
		e7.setExcentricidadeOrbital(0.00136);
		e7.setReferenciaOrbital("Geocêntrica");
		e7.setPeriodoOrbital("96.4");
		e7.setInclinacaoOrbital(4.0);
		e7.setTelescopeSpaceDto(ts7);

		TelescopeSpaceDTO t7 = new TelescopeSpaceDTO();
		t7.setId(25l);
		t7.setNome("BeppoSAX");
		t7.setImg("https://heasarc.gsfc.nasa.gov/Images/sax/sax.jpg");
		t7.setTipo("Telescopio");
		t7.setMissao(
				"BeppoSAX foi um telescópio orbital de raios X ítalo-neerlandês, cujo nome é uma homenagem ao físico Giuseppe \"Beppo\" Occhialini. A sigla SAX vem do italiano Satellite per Astronomia a raggi X (satélite para astronomia de raios X).");
		t7.setDurationMissao("7 anos");
		t7.setDataDelancamento("30/04/1996");
		t7.setStatus("desativado");
		t7.setEstruturaObservacionaisDto(Arrays.asList(eo7));
		t7.setPropriedadeEstruturaisDto(Arrays.asList(p7));
		t7.setEspecificacaoOrbitalDto(Arrays.asList(e7));
 

		TelescopeSpaceDTO ts8 = new TelescopeSpaceDTO();
		ts8.setId(29l);

		EstruturaObservacionaisDTO eo8 = new EstruturaObservacionaisDTO();
		eo8.setId(29l);
		eo8.setMassaDeLacamento("613");
		eo8.setPotenciaEletrica(2.132);
		eo8.setGeracaoDeEnergia("Painéis solares fotovoltaicos");
		eo8.setComprimentoDeOndas("γ, X, UV, visível");
		eo8.setTelescopeSpaceDto(ts8);

		PropriedadeEstruturaisDTO p8 = new PropriedadeEstruturaisDTO();
		p8.setId(29l);
		p8.setComprimento(0.0);
		p8.setApoastro(562.5);
		p8.setDiametro(0.0);
		p8.setPeriastro(546.6);
		p8.setDistanciaFocal(0.0);
		p8.setTelescopeSpaceDto(ts8);

		EspecificacaoOrbitalDTO e8 = new EspecificacaoOrbitalDTO();
		e8.setId(29l);
		e8.setDecaimento("");
		e8.setExcentricidadeOrbital(15.04);
		e8.setReferenciaOrbital("Geocêntrica");
		e8.setPeriodoOrbital("95.74");
		e8.setInclinacaoOrbital(0.0);
		e8.setTelescopeSpaceDto(ts8);

		TelescopeSpaceDTO t8 = new TelescopeSpaceDTO();
		t8.setId(29l);
		t8.setNome("Neil Gehrels Swift Observatory");
		t8.setImg(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Swift_Observatory_spacecraft_model.png/800px-Swift_Observatory_spacecraft_model.png");
		t8.setTipo("Telescopio");
		t8.setMissao(
				"O Neil Gehrels Swift Observatory, anteriormente chamado de Swift Gamma-Ray Burst Mission, é um observatório espacial da NASA  ");
		t8.setDurationMissao("32 anos");
		t8.setDataDelancamento("20/11/2004");
		t8.setStatus("desativado");
		t8.setEstruturaObservacionaisDto(Arrays.asList(eo8));
		t8.setPropriedadeEstruturaisDto(Arrays.asList(p8));
		t8.setEspecificacaoOrbitalDto(Arrays.asList(e8));

 		TelescopeSpaceDTO tsdto = mapper.map(t1, TelescopeSpaceDTO.class);
		TelescopeSpaceDTO tsdto2 = mapper.map(t2, TelescopeSpaceDTO.class);
		TelescopeSpaceDTO tsdto3 = mapper.map(t3, TelescopeSpaceDTO.class);
		TelescopeSpaceDTO tsdto4 = mapper.map(t4, TelescopeSpaceDTO.class);
		TelescopeSpaceDTO tsdto5 = mapper.map(t5, TelescopeSpaceDTO.class);
		TelescopeSpaceDTO tsdto6 = mapper.map(t6, TelescopeSpaceDTO.class);
		TelescopeSpaceDTO tsdto7 = mapper.map(t7, TelescopeSpaceDTO.class);
		TelescopeSpaceDTO tsdto8 = mapper.map(t8, TelescopeSpaceDTO.class);

 		repository.saveAll(Arrays.asList(mapper.map(tsdto, TelescopeSpace.class)));
		repository.saveAll(Arrays.asList(mapper.map(tsdto2, TelescopeSpace.class)));
		repository.saveAll(Arrays.asList(mapper.map(tsdto3, TelescopeSpace.class)));
		repository.saveAll(Arrays.asList(mapper.map(tsdto4, TelescopeSpace.class)));
		repository.saveAll(Arrays.asList(mapper.map(tsdto5, TelescopeSpace.class)));
		repository.saveAll(Arrays.asList(mapper.map(tsdto6, TelescopeSpace.class)));
		repository.saveAll(Arrays.asList(mapper.map(tsdto7, TelescopeSpace.class)));
		repository.saveAll(Arrays.asList(mapper.map(tsdto8, TelescopeSpace.class)));


	}
}