package com.carlospereira.desafiosefaz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.carlospereira.desafiosefaz.domain.NovoUsuario;
import com.carlospereira.desafiosefaz.domain.Telefone;
import com.carlospereira.desafiosefaz.domain.Usuario;
import com.carlospereira.desafiosefaz.repositories.TelefoneRepository;
import com.carlospereira.desafiosefaz.repositories.UsuarioRepository;
import com.carlospereira.desafiosefaz.services.exception.DataIntegrityException;
import com.carlospereira.desafiosefaz.services.exception.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepositorio;

	@Autowired
	private TelefoneRepository telefoneRepositorio;

	public List<Usuario> findall() {
		return usuarioRepositorio.findAll();
	}

	public Usuario find(Integer id) {
		Optional<Usuario> obj = usuarioRepositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Usuario não encontrado! Id: " + id));
	}

	public Usuario insert(Usuario obj) {
		obj.setId(null);
		obj = usuarioRepositorio.save(obj);
		telefoneRepositorio.saveAll(obj.getTelefones());
		return obj;
	}

	public Usuario update(Usuario obj) {
		Usuario novoObj = find(obj.getId());
		updateData(novoObj, obj);
		return usuarioRepositorio.save(novoObj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			usuarioRepositorio.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não foi possível deletar o usuario " + id);
		}
	}

	public Usuario fromUsuario(NovoUsuario novoObj) {
		Usuario u1 = new Usuario(null, novoObj.getNome(), novoObj.getEmail(), novoObj.getSenha());
		Telefone t1 = new Telefone(null, novoObj.getDdd(), novoObj.getNumero(), novoObj.getTipo(), u1);

		u1.getTelefones().add(t1);

		return u1;
	}

	private void updateData(Usuario novoObj, Usuario obj) {
		novoObj.setNome(obj.getNome());
		novoObj.setEmail(obj.getEmail());
		novoObj.setSenha(obj.getSenha());
		novoObj.setTelefones(obj.getTelefones());
	}
}
