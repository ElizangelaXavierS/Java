package estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, sexo = 0, categoria = 0, backend = 0, frontend = 0, mobile = 0, full = 0;
		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Didite a idade: ");
			idade = leia.nextInt();

			System.out.println("Didite o sexo: ");
			sexo = leia.nextInt();

			System.out.println("Didite a categoria: ");
			categoria = leia.nextInt();

			System.out.println("Deseja continua (S/N) ");
			leia.skip("\\R?");
			continua = leia.nextLine();

			if (categoria == 1) {
				backend++;
			}
			if (sexo == 2 && categoria == 2) {
				frontend++;
			}
			if (sexo == 1 && categoria == 3 && idade > 40) {
				mobile++;

			}
			if (sexo == 2 && categoria == 4 && idade > 30) {
				full++;
			}

		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + frontend);
		System.out.println("Total de homens desenvolvedores Mobile maiors de 40 anos: " + mobile);
		System.out.println("Total de mulheres desenvolvedoras FuulStack menores de 30 anos: " + full);
		leia.close();
	}

}
