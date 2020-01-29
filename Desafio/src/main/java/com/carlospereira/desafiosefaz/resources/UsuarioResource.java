package com.carlospereira.desafiosefaz.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carlospereira.desafiosefaz.domain.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Usuario> listar() {
		
		Usuario u1 = new Usuario(1, "Carlos", "c.henrique1309@gmail.com", "1234");
		
		List <Usuario> lista = new ArrayList<>();
		lista.add(u1);
		
		return lista;
	}
	
}
