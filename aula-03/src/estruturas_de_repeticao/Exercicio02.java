package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero, totalPares = 0, totalImpares = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				totalPares++;
				
			} else {
				totalImpares++;
				
			}
		}
		System.out.println("Total de números pares: " + totalPares);
		System.out.println("Total de números inpares: " + totalImpares);
	}

}
