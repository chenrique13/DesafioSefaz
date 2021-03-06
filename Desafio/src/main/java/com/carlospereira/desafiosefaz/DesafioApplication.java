package com.carlospereira.desafiosefaz;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.carlospereira.desafiosefaz.domain.Telefone;
import com.carlospereira.desafiosefaz.domain.Usuario;
import com.carlospereira.desafiosefaz.repositories.TelefoneRepository;
import com.carlospereira.desafiosefaz.repositories.UsuarioRepository;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private TelefoneRepository telefoneRepository;

	@Autowired
	private BCryptPasswordEncoder cod;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// criando usuarios
		Usuario admin = new Usuario(null, "Admin", "administrador@hotmail.com", cod.encode("admin"));
		Usuario usuario1 = new Usuario(null, "Carlos", "c.henrique1309@gmail.com", cod.encode("12345678"));
		Usuario usuario2 = new Usuario(null, "Henrique", "henrique@gmail.com", cod.encode("12345678"));

		// criando telefones e associando o usuario

		Telefone telefone1 = new Telefone(null, 81, "85740926", "Celular", usuario1);
		Telefone telefone2 = new Telefone(null, 81, "34430926", "Residencial", usuario1);
		Telefone telefone3 = new Telefone(null, 81, "95562199", "Celular", usuario2);

		// Salvando usuarios e telefones no banco

		usuarioRepository.saveAll(Arrays.asList(admin, usuario1, usuario2));
		telefoneRepository.saveAll(Arrays.asList(telefone1, telefone2, telefone3));

	}

}
