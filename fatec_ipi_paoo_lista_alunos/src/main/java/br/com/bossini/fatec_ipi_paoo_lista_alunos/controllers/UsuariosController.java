package br.com.bossini.fatec_ipi_paoo_lista_alunos.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.beans.Usuario;
import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.service.UsuariosService;

@Controller
public class UsuariosController {
	
	@Autowired
	private UsuariosService usuarioService;
	
	@GetMapping (value = {"/login", "/"})
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject(new Usuario());
		return mv;
	}
	
	@PostMapping ("/fazerLogin")
	public String fazerLogin (HttpServletRequest request, Usuario usuario) {
		if (usuarioService.logar(usuario)) {
			request.getSession().setAttribute("usuarioLogado", usuario);
			return "redirect:alunos";
		}
		return "login";
	}
	
	
	

}
