package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade = 0;
		int totalMenores = 0;
		int totalMaiores = 0;

		while (idade >=0) {
			System.out.println("Digite uma idade:");
			idade = leia.nextInt();
			if (idade > 0 && idade < 21) {
				totalMenores++;
			}
			if (idade > 50) {
				totalMaiores++;
			}
		}
		System.out.println("Tota de pessoas menores que 21 anos : " + totalMenores);
		System.out.println("Tota de pessoas maiores que 50 anos : " + totalMaiores);
	}

}
