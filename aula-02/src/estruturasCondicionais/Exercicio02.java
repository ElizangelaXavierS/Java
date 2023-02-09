package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		String parImpa;
		String positivoNegativo;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0 ) {
			parImpa  = "par";
		}else {
			parImpa = "impar";				
		}
		if (numero >= 0) {
			positivoNegativo = "positivo";
		}else {
			positivoNegativo = "negativo";
		}
		
		System.out.println("O numero " + numero + " é " + parImpa + " e " + positivoNegativo + "!");

	}

}
