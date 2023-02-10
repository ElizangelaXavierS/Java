package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número do intervalo:");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo númerodo intervalo:");
		numero2 = leia.nextInt();
		
		
		if (numero2 <= numero1) {
			System.out.println("O intervalo inválido");			
		}else {
			for (int i = numero1; i <= numero2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");			
					
				}
			}
		}
		
		

	}

}
