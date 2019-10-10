package br.com.bossini.fatec_ipi_paoo_lista_alunos.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.beans.Usuario;
import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.repository.UsuariosRepository;

@Service
public class UsuariosService {
	
	@Autowired
	UsuariosRepository usuarioRepo;
	
	public boolean logar (Usuario u) {
		return 
		usuarioRepo.findOneByLoginAndSenha(u.getLogin(), u.getSenha()) != null;
	}

}
