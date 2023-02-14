package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, quantidade = 0;
		float soma = 0, media;
		
		do {
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		
		if (numero % 3 == 0) {
			quantidade++;
			soma += numero;	
			
			System.out.println("lllllllllllllll" + numero);
			
		}
		
		}while(numero != 0);
		media = soma / quantidade;
		
		System.out.println("Amedia de todos os números multiplos de 3 é: " + media);
		leia.close();

	}

}
