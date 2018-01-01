package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioFicherosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioFicherosApplication.class, args);
		
		LeeFichero fichero = new LeeFichero ("C:\\Users\\Jbajo\\Documents\\workspace-sts-3.9.1.RELEASE\\EjercicioFicheros\\documento.txt");		
		fichero.leerFichero();
		
		EscribeFichero ficherow = new EscribeFichero("C:\\Users\\Jbajo\\Documents\\workspace-sts-3.9.1.RELEASE\\EjercicioFicheros\\documento.txt");
		ficherow.EscribirFichero("hola mundo");
		ficherow.EscribirFichero("Texto de ejemplo...");
		fichero.leerFichero();
		fichero.cerrarFichero();
		ficherow.cerrarFichero();
	}
}
