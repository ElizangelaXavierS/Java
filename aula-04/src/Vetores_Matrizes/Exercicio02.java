package Vetores_Matrizes;

public class Exercicio02 {

	public static void main(String[] args) {

		float soma = 0;
		float media = 0;
		String pares = "";
		String impares = "";
		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 == 0) {
				pares += numeros[i] +" ";
			}else {
				impares += numeros[i] +" ";
			}

			soma = numeros[i] + soma;
			media = soma / 10;

		}

		System.out.println(" \n Elementos nos indices impares: " + impares);
		System.out.println(" \n Elementos nos indices pares: " + pares);
		System.out.println(" \n A soma é: " + soma);
		System.out.println(" \n A média é: " + media);

	}
}
