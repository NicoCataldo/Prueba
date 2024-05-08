package com.example.TP1LAB4;

import com.example.TP1LAB4.Entities.Empresa;
import com.example.TP1LAB4.Repositories.EmpresaRepository;
import com.example.TP1LAB4.Repositories.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tp1Lab4Application {
	@Autowired
	EmpresaRepository empresaRepository;
	public static void main(String[] args) {
		SpringApplication.run(Tp1Lab4Application.class, args);
		System.out.println("funcionando");
	}
	
}
