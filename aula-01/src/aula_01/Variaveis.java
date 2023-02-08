package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###.##");
		Scanner leia = new Scanner(System.in);
		int numero;
		String nome;
		double area;
		
		 
		System.out.println("Digite un numero inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("Digite seu nome:");
		//leia.skip("\\R?");
		nome = leia.next();
		
		System.out.println("Digite a area: ");
		area = leia.nextDouble();
		
		
//		System.out.println(" O nome da Participante é: " + nome);
//		System.out.println(" O Numero é: " + numero);
//		System.out.printf(" O Numero é: %.2f\n", area);
//		
//		System.out.println(" O Area é:" + df.format(area));


	}

}
