package exemplos_em_aula;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();

		int opcao = 0;
		double nota = 0.0;

		do {
			System.out.println("1 - Cadastra nota");
			System.out.println("2 - Listar notas");
			System.out.println("3 - Buscar uma nota ");
			System.out.println("4 - Remover uma nota: ");
			System.out.println("5 - Atualizar uma nota ");
			System.out.println("6 - Sair ");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite uma nota de 1 a 10: ");
				nota = leia.nextDouble();
				notas.add(nota);
				break;
			case 2:
				System.out.println("Listar todas as notas");

				if (notas.isEmpty()) {
					System.out.println("Base de dados vazia");
				} else {
					notas.forEach(System.out::println);

				}

				break;
			case 3:
				System.out.println("Procurar uma nota");
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();

				System.out.println("A nota " + nota + " existe?" + notas.contains(nota));

				if (notas.contains(nota)) {
					System.out.println("O indice da minha nota é: " + notas.indexOf(nota));
				}else {
					System.out.println("Nota não existe");
				}

				break;
			case 4:
				System.out.println("Remover uma nota");
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				
				if(notas.contains(nota)) {
				notas.remove(notas.indexOf(nota));
				}else {
					System.out.println("Nota não existe");
				}

				break;
			case 5:
				System.out.println("Atualir uma nota");
				System.out.println("Digite a nota atual: ");

				nota = leia.nextDouble();

				System.out.println("Remover uma nota");
				System.out.println("Digite a nova nota: ");

				double novaNota = leia.nextDouble();
				notas.set(notas.indexOf(nota), novaNota);

				break;
			default:
				System.out.println("Opção Inválida!");

			}

		} while (opcao != 6);

	}
}
