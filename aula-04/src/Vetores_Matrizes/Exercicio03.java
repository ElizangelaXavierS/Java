package Vetores_Matrizes;

public class Exercicio03 {

	public static void main(String[] args) {

		int matrizInteiros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int cont = matrizInteiros.length - 1, somaPrincipal = 0, somaSecundaria = 0;
		System.out.println("Elementos da diagonal principal:");
		for (int i = 0; i < matrizInteiros.length; i++) {
			System.out.print(matrizInteiros[i][i] + " ");
			somaPrincipal += matrizInteiros[i][i];
		}

		System.out.println("\n\nElementos da diagonal secundaria:");
		for (int i = 0; i < matrizInteiros.length; i++) {
			System.out.print(matrizInteiros[i][cont] + " ");
			somaSecundaria += matrizInteiros[i][cont--];
		}
		System.out.println("\n\nSoma dos Elementos da diagonal principal: \n" + somaPrincipal);
		System.out.println("\nSoma dos Elementos da diagonal secundario: \n" + somaPrincipal);

	}

}
