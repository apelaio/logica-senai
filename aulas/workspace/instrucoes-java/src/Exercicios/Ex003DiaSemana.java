package Exercicios;

import java.util.Random;

public class Ex003DiaSemana {

	public static void main(String[] args) {
		int n = new Random().nextInt(7) + 1;

		switch (n) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira Droga !!");
			break;
		case 3:
			System.out.println("Ter�a-Feira - Dia de futebol");
			break;
		case 4:
			System.out.println("Quarta-Feira - Dia de Feijoada");
			break;
		case 5:
			System.out.println("Quinta-Feira - Dia de Macarronada");
			break;
		case 6:
			System.out.println("Sexta Feira - Dia da Maldade");
			break;
		case 7:
			System.out.println("S�bad�o - Bora l� tomar uma");
			break;

		}
	}

}
