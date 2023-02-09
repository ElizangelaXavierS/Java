package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		if (( A + B )> C)
			System.out.println("A Soma de A + B é Maior do que C");
		
		else if (( A + B ) < C)
			System.out.println("A Soma de A + B é Menor do que C");

		else 
			System.out.println("A Soma de A + B é Igual a C");
			
		
		leia.close();

	}

}
