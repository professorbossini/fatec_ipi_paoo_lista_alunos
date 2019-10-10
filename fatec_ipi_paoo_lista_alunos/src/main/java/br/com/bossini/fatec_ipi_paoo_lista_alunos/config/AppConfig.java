package br.com.bossini.fatec_ipi_paoo_lista_alunos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.bossini.fatec_ipi_paoo_lista_alunos.interceptors.LoginInterceptor;
import br.com.bossini.fatec_ipi_paoo_lista_alunos.model.utils.Calculadora;

@Configuration
public class AppConfig implements WebMvcConfigurer{
	
	@Bean
	public Calculadora getCalculadora () {
		return new Calculadora();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(
				new LoginInterceptor()
		).addPathPatterns("/**").
		excludePathPatterns("/login", "/", "/fazerLogin");
	}

}
