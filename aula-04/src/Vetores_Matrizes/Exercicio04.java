package Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float[][] notas = new float[10][4];

		for (int linha = 0; linha < notas.length; linha++) {
			System.out.println("Digite as notas do participante " + (linha + 1) + ":");
			for (int coluna = 0; coluna < notas[linha].length; coluna++) {
				System.out.println("Nota " + (coluna + 1) + ": ");
				notas[linha][coluna] = leia.nextFloat();
			}
		}

		float[] medias = new float[10];
		for (int linha = 0; linha < 10; linha++) {
			float soma = 0;
			for (int coluna = 0; coluna < 4; coluna++) {
				soma += notas[linha][coluna];
			}
			medias[linha] = soma / 4;
		}

		for (int linha = 0; linha < 10; linha++) {
			System.out.println("Média do participante " + (linha + 1) + ": " + medias[linha]);
		}
		leia.close();
	}

}
