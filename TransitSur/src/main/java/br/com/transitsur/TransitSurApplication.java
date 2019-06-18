package br.com.transitsur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"br.com.transitsur"})
public class TransitSurApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransitSurApplication.class, args);
	}
//sempre rodar o boot para inicializar o projeto e descobrir se tem bugs no projeto
}
