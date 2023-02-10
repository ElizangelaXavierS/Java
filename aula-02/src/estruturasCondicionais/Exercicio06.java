package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome, cargo;
		int codigo;
		float salario, novoSalario;

		System.out.println("Nome do colaborador: ");
		leia.skip("\\R?");
		nome = leia.nextLine();

		System.out.println("Cargo: ");
		codigo = leia.nextInt();

		System.out.println("Sálario: ");
		salario = leia.nextFloat();

		switch (codigo) {
		case 1:
			novoSalario = salario + (0.1f * salario);
			cargo = "Gerente";
			break;
		case 2:
			novoSalario = salario + (0.07f * salario);
			cargo = "Vendedor";
			break;
		case 3:
			novoSalario = salario + (0.09f * salario);
			cargo = "Supervisor";
			break;
		case 4:
			novoSalario = salario + (0.06f * salario);
			cargo = "Motorista";
			break;
		case 5:
			novoSalario = salario + (0.05f * salario);
			cargo = "Estoquista";
			break;
		case 6:
			novoSalario = salario + (0.08f * salario);
			cargo = "Técnico de TI";
			break;
		default:
			novoSalario = 0;
			cargo = "Inválido";

		}
		
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Sálario: R$" + novoSalario);

	}

}
