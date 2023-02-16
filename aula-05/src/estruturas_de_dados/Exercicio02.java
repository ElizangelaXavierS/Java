package estruturas_de_dados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();

		int opcao;
		String nome;

		while (true) {
			System.out.println("===========================================");
			System.out.println("                                           ");
			System.out.println("       1 - Adicionar livro na pilha        ");
			System.out.println("       2 - Listar todos os livros          ");
			System.out.println("       3 - Retira livro da pilha           ");
			System.out.println("       0 - Sair                            ");
			System.out.println("                                           ");
			System.out.println("===========================================");
			System.out.println("Entre com a opção desejada: ");
			System.out.println("                                           ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("O programa foi finalizado! ");
				leia.close();
				System.exit(0);

			}
			switch (opcao) {
			case 1:
				System.out.println("Adicionar livro!");
				System.out.println("Digite o nome do livro: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				pilha.add(nome);
				;
				System.out.println("Livro adicionado! ");

				break;
			case 2:
				System.out.println("Consultar pilha de livros ");
				pilha.forEach(System.out::println);

				break;
			case 3:
				System.out.println("Retira Livro ");
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {
					System.out.println("O Livro " + pilha.pop() + " foi retirado da pilha!");
				}

				break;
			default:
				System.out.println("Opção inválida! ");
			}
		}

	}

}
