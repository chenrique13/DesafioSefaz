package com.carlospereira.desafiosefaz;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carlospereira.desafiosefaz.domain.Usuario;
import com.carlospereira.desafiosefaz.repositories.UsuarioRepository;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario usuario1 = new Usuario(null, "Carlos", "c.henrique1309@gmail.com", "1234");
		Usuario usuario2 = new Usuario(null, "Henrique", "henrique@gmail.com", "1234");
		
		//Salvando usuarios no banco
		
		usuarioRepository.saveAll(Arrays.asList(usuario1,usuario2));
		
	}

}
