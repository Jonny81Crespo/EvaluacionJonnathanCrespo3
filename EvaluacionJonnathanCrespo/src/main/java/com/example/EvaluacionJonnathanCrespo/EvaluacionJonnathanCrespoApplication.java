package com.example.EvaluacionJonnathanCrespo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class EvaluacionJonnathanCrespoApplication {


	public static void main(String[] args) {


		SpringApplication.run(EvaluacionJonnathanCrespoApplication.class, args);

		System.out.println("Pregunta 1");
		//Se necesita escribir un programa Java que imprima en pantalla los números del 1 al 100, sustituyendo los  múltiplo de 3 por la palabra “SOMOS” y los múltiplo de 5 por “BA”. Para los números múltiplos de 3 y 5 a la vez sustituir con la combinación de “SOMOS BA”
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("SOMOS BA");

			} else if (i % 3 == 0) {
				System.out.println("SOMOS");

			} else if (i % 5 == 0) {
				System.out.println("BA");

			} else {
				System.out.println(i);
			}
		}
		System.out.println("Pregunta 2");
		//Escriba un método que decida si dos String son anagramas o no.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa una palabra: ");
		String pal1 = scanner.nextLine();

		System.out.print("Ingresa una palabra: ");
		String pal2 = scanner.nextLine();

		if (Anagramas(pal1, pal2)) {
			System.out.println(pal1 + " y " + pal2 + " son anagramas.");
		} else {
			System.out.println(pal1 + " y " + pal2 + " no son anagramas.");
		}

		System.out.println("Pregunta 3");
		//Escriba un método que ordene de mayor a menor el siguiente arreglo utilizando un método de su elección:

		int arreglo[]={50,5,10,36,25,85,23,65};


		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = i + 1; j < arreglo.length; j++) {
				if (arreglo[j] > arreglo[i]) {
					int aux = arreglo[j];
					arreglo[j] = arreglo[i];
					arreglo[i] = aux;
				}
			}

			System.out.print(arreglo[i]+" ");
		}

		//Pregunta 4 la base de datos que use fue postgres y se debe entrar a este url para agregar todos los datos a la base de datos http://localhost:8080/api/insertardatos
//Pregunta 5 Con la información almacenada en la Base de Datos del punto 4, realizar un servicio en donde se consulte todos los title de un userId enviado.
	}


	public static boolean Anagramas(String pal1, String pal2) {

		pal1 = pal1.replaceAll("\\s", "").toLowerCase();
		pal2 = pal2.replaceAll("\\s", "").toLowerCase();

		if (pal1.length() != pal2.length()) {
			return false;
		}

		char[] charArray1 = pal1.toCharArray();
		char[] charArray2 = pal2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);

	}


}
