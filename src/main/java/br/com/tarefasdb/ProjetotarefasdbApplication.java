package br.com.tarefasdb;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetotarefasdbApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ProjetotarefasdbApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port","8095"));
		app.run(args);
	}

}
