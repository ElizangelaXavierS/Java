package exemplo_em_aula;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;
		boolean ok = false;
		String continua;

		do {
			do {
				System.out.println("Digite a tabuada que voce deseja");
				numero = leia.nextInt();

				if (numero < 1 || numero > 10)
					System.out.println("Digite um número entre 1 e 10");
				else
					ok = true;

			} while (!ok);
			int contador = 1;

			while (contador <= 10) {
				System.out.println("\n" + numero + " X " + contador + " = " + (numero * contador));
				contador++;
			}
			ok = false;

			System.out.println("Deseja continuar(S/N)?: ");
			leia.skip("\\R?");
			continua = leia.nextLine();

		} while (continua.equals("S"));

	}
}

