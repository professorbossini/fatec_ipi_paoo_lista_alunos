package br.com.bossini.fatec_ipi_paoo_lista_alunos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.beans.Aluno;

@Repository
public interface AlunosRepository extends JpaRepository<Aluno, Long> {

}
