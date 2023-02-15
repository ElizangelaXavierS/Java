package estruturas_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		int opcao;
		String nome;

		while (true) {
			System.out.println("===========================================");
			System.out.println("                                           ");
			System.out.println("       1 - Adicionar cliene na fila        ");
			System.out.println("       2 - Listar todos os clientes        ");
			System.out.println("       3 - Retira o cliente da lista       ");
			System.out.println("       4 - Sair                            ");
			System.out.println("                                           ");
			System.out.println("===========================================");
			System.out.println("Entre com a opção desejada: ");
			System.out.println("                                           ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("programa foi finalizado! ");
				leia.close();
				System.exit(0);

			}
			switch (opcao) {
			case 1:
				System.out.println("Adicionar cliente");
				System.out.println("Digite o nome do cliente: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				fila.add(nome);
				;
				System.out.println("Cliente adicionado! ");

				break;
			case 2:
				System.out.println("Consultar cliente na fila! ");
				fila.forEach(System.out::println);

				break;
			case 3:
				System.out.println("Chama cliente! ");
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia! ");
				} else {
					System.out.println("Cliente: " + fila.poll() + " compareça ao guichê 1");
				}

				break;
			default:
				System.out.println("Opção inválida! ");
			}
		}
	}

}
