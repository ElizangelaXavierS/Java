package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int codigo;
		float saldo = 1000;
		float saque, res, deposito;

		System.out.println("Digite o código da operação: ");
		codigo = leia.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Saldo: " + saldo);
			break;
		case 2:
			System.out.println("Digite o valor do saque: ");
			saque = leia.nextFloat();

			if (saque > saldo) {
				System.out.println("Saldo insuficiente!");
			} else {
				res = saldo - saque;
				System.out.println("Seu saque foi de: " + saque + "\n e seu novo saldo é:" + res);
			}
			break;
		case 3:
			System.out.println("Digite o valor do seu deposito: ");
			deposito = leia.nextFloat();

			res = saldo + deposito;

			System.out.println("Novo Saldo: " + res);
			break;
		default:
			System.out.println("Operação inválida");

			break;

		}
		leia.close();

	}

}
