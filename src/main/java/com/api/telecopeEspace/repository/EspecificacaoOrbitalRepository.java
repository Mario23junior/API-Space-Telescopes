package com.api.telecopeEspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.telecopeEspace.model.EspecificacaoOrbital;

@Repository
public interface EspecificacaoOrbitalRepository extends JpaRepository<EspecificacaoOrbital, Long>{

}
