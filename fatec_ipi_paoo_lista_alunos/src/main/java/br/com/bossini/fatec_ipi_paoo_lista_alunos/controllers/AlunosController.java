package br.com.bossini.fatec_ipi_paoo_lista_alunos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.beans.Aluno;
import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.service.AlunosService;



@Controller
public class AlunosController {
	
	
	//@Autowired
	//private AlunosRepository alunosRepository;
	
	
	@Autowired
	private AlunosService alunosService;
	
	@GetMapping ("/alunos")
	public ModelAndView listarAlunos () {
		ModelAndView mav = new ModelAndView("lista_alunos");
		mav.addObject(new Aluno());
		List <Aluno> alunos = alunosService.listarTodos();
		mav.addObject("alunos", alunos);
		return mav;
	}
	
	@PostMapping ("/alunos")
	public String salvar (Aluno aluno) {
		alunosService.salvar(aluno);
		return "redirect:/alunos";
	}

}
