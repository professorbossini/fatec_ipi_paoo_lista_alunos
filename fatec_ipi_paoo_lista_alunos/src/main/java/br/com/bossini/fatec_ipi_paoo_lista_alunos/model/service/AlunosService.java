package br.com.bossini.fatec_ipi_paoo_lista_alunos.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.beans.Aluno;
import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.repository.AlunosRepository;
import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.utils.Calculadora;

@Service
public class AlunosService {
	
	@Autowired
	private AlunosRepository alunoRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Aluno aluno) {
		alunoRepo.save(aluno);
	}
	
	public List <Aluno> listarTodos (){
		List<Aluno> alunos = alunoRepo.findAll();
		for (Aluno aluno : alunos) {
			aluno.setMediaFinal(calculadora.calculaMedia(
					aluno.getNota1(),
					aluno.getNota2()
			));
			/*aluno.setMediaFinal(calculadora.calculaMedia(
					new double[] {
							aluno.getNota1(),
							aluno.getNota2()
					}
			));*/
		}
		return alunos;
	}

}
