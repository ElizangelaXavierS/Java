package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n1,n2, resultado;
		int codigo;
		
		System.out.println("Digite o primeiro número:");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número:");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a operação: \n"
				+ "1 - Soma \n"
				+ "2 - Substração \n"
				+ "3 - Multiplicação \n"
				+ "4 - Divisão");
		codigo = leia.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
			break;
		case 2:
			System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
			break;
		case 3:
			System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
			break;
		case 4:
			System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
			break;
		default:
			System.out.println("Operação Invalida");
		}

	}

}
