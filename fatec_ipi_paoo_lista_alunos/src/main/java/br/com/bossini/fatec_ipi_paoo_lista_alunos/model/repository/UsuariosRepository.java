package br.com.bossini.fatec_ipi_paoo_lista_alunos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.beans.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {
	public abstract Usuario findOneByLoginAndSenha (String login, String senha);
}
