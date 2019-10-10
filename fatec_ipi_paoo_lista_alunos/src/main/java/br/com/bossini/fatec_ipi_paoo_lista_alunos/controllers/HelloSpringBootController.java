package br.com.bossini.fatec_ipi_paoo_lista_alunos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringBootController {
	
	@GetMapping ("/hello")
	public String qualquerCoisa () {
		System.out.println("Passou pelo método");
		return "hello_spring_boot";
	}

}
