package Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int n;
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		boolean encontrado = false;
		
		System.out.println("Digite o número que você deseja encontrar:");
		n = leia.nextInt();
		
		for (int i = 0; i < numeros.length; i ++) {
			
			if ( numeros[i] == n ) {
				System.out.println("O número " + n + " está localizado na posição: " + i);
				encontrado = true;
				break;
			}else if (i == numeros.length -1 && !encontrado) {
				System.out.println("O número " + n + " não foi encontrado!");
			}
			
		}
		
	}

}
