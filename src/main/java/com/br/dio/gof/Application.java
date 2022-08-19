package com.br.dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring data JPA
 * - Spring web
 * - Lombok
 * - H2 Database
 * - OpenFeign
 *
 * @author Michelle
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
