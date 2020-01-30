package com.carlospereira.desafiosefaz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.carlospereira.desafiosefaz.domain.Usuario;
import com.carlospereira.desafiosefaz.repositories.UsuarioRepository;
import com.carlospereira.desafiosefaz.services.exception.DataIntegrityException;
import com.carlospereira.desafiosefaz.services.exception.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;

	public List <Usuario> findall() {
		return repositorio.findAll();
	}
	
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
		Usuario novoObj = find(obj.getId());
		updateData(novoObj, obj);
		return repositorio.save(novoObj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
		repositorio.deleteById(id);
		}catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não foi possível deletar o usuario " + id);
		}
	}	
	private void updateData(Usuario novoObj, Usuario obj) {
		novoObj.setNome(obj.getNome());
		novoObj.setEmail(obj.getEmail());
		novoObj.setSenha(obj.getSenha());
		novoObj.setTelefones(obj.getTelefones());
	}
}
