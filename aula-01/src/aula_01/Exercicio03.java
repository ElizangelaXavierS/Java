package aula_01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o salario bruto:");
		float salarioBruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno:");
		float adicionalNoturno = leia.nextFloat();

		System.out.println("Digite o valor das  horas extras:");
		float horaExtras = leia.nextFloat();

		System.out.println("Digite o valor dos descontos:");
		float descontos = leia.nextFloat();

		float salarioLiquido = salarioBruto + adicionalNoturno + (horaExtras * 5) - descontos; 
		System.out.println("O Salario Liquido é: " + salarioLiquido);

	}

}
