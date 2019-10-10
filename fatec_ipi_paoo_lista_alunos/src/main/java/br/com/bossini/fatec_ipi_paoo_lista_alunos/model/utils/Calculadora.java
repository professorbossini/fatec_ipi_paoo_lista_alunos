package br.com.bossini.fatec_ipi_paoo_lista_alunos.model.utils;


public class Calculadora {
	
	public double calculaMedia (double... valores) {
		double media = 0;
		for (Double elemento: valores) {
			media += elemento;
		}
		return valores.length > 0 ? media / valores.length : 0;
	}

}
