package com.carlospereira.desafiosefaz.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlospereira.desafiosefaz.domain.Usuario;
import com.carlospereira.desafiosefaz.repositories.UsuarioRepository;
import com.carlospereira.desafiosefaz.services.exception.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;

	public Usuario find(Integer id) {
		Optional<Usuario> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new 
				ObjectNotFoundException("Usuario não encontrado! Id: " + id));
	}

	public Usuario insert(Usuario obj) {
		obj.setId(null);
		return repositorio.save(obj);
	}

	public Usuario update(Usuario obj) {
		find(obj.getId());
		return repositorio.save(obj);
	}
}
