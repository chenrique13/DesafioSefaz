package com.carlospereira.desafiosefaz.services;

import org.springframework.stereotype.Service;

import com.carlospereira.desafiosefaz.domain.Usuario;
import com.carlospereira.desafiosefaz.repositories.UsuarioRepository;

import java.util.Optional;

@Service
public class UsuarioService {

	private UsuarioRepository repositorio;
	
	public Usuario buscar(Integer id) {
		Optional<Usuario> obj = repositorio.findById(id);
		return obj.orElse(null);
	}
}