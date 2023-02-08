package aula_01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite primeiro número:");
		float n1 = leia.nextFloat();
		
		System.out.println("Digite segundo número:");
		float n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro numero:");
		float n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número:");
		float n4 = leia.nextFloat();
		
		float calculo  = (n1 * n2) - (n3 * n4);
		System.out.println("Resultado: " + calculo);

	}
}
