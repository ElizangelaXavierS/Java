package aula_01;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário:");
		float salario = leia.nextFloat();
		
		System.out.println("Digite o abono:");
		float abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.println("O novo salário é:" + novoSalario);
		
	}
}
