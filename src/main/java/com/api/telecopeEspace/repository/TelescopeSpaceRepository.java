package com.api.telecopeEspace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.telecopeEspace.model.TelescopeSpace;

public interface TelescopeSpaceRepository extends JpaRepository<TelescopeSpace, Long> {
   
	List<TelescopeSpace> findByNome (String nome);
}
