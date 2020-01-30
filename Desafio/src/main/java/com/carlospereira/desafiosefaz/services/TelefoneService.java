package com.carlospereira.desafiosefaz.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlospereira.desafiosefaz.domain.Telefone;
import com.carlospereira.desafiosefaz.repositories.TelefoneRepository;

@Service
public class TelefoneService {
	
	@Autowired
	private TelefoneRepository repositorio;

	public Telefone find(Integer id) {
		Optional<Telefone> obj = repositorio.findById(id);
		return obj.orElse(null);
	}
	
	public Telefone insert(Telefone obj) {
		obj.setId(null);
		return repositorio.save(obj);
	}
	
	public Telefone update(Telefone obj) {
		find(obj.getId());
		return repositorio.save(obj);
	}
}
