package com.carlospereira.desafiosefaz.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlospereira.desafiosefaz.domain.Usuario;
import com.carlospereira.desafiosefaz.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repositorio;

	public Usuario buscar(Integer id) {
		Optional<Usuario> obj = repositorio.findById(id);
		return obj.orElse(null);
	}
	
	public Usuario insert(Usuario obj) {
		obj.setId(null);
		return repositorio.save(obj);
	}
}
