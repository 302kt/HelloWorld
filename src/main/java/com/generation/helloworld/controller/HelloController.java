package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}
	
	@GetMapping("/nome")
	public String nome() {
		return "<h3 style=\"color:red;\">Katarina</h3>";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
				
		return "<h1>Lista de bsm's:</h1>\r\n"
				+ "<h3 style=\"color:orange;\">Comunicação;<br> \r\n"
				+ "<font style=\"color:brown;\">Mentalidade de Crescimento;</font> <br>\r\n"
				+ "<font style=\"color:orange;\">Orientação ao Detalhe; </font> <br>\r\n"
				+ "<font style=\"color:brown;\">Orientação ao Futuro; </font> <br>\r\n"
				+ "<font style=\"color:orange;\">Persistência; </font> <br>\r\n"
				+ "<font style=\"color:brown;\">Proatividade; </font> <br>\r\n"
				+ "<font style=\"color:orange;\">Responsabilidade pessoal;</font> <br>\r\n"
				+ "<font style=\"color:brown;\">Trabalho em equipe.</font> </h3>\r\n";
	}
	
	@GetMapping("/obj")
	public String objetivos() {
		return "<h1 style=\"color:blue;\">Objetivos:</h1>\r\n"
				+ "<h3>Tenho para essa semana o objetivo continuar dando o meu melhor no bootcamp, aprender muito do Spring, html, Mysql, Git, Github e também conseguir fazer revisão do que aprendi em java. <br>\r\n"
				+ "Além disso, também quero continuar com uma boa comunicação e trabalho em equipe com meus amigos do projeto integrador, sempre desenvolvendo e aprimorando minhas habilidades comportamentais. Além disso, tenho como meta conseguir construir uma boa gestão de tempo! :) </h3>";
	}
	
}
