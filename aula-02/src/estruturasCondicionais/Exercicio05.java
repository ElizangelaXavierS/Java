package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, quantidade;
		float valor;
		String produto;
		
		
		System.out.println("Digite um número de 1 á 6: ");
		numero = leia.nextInt();
	
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch (numero){
		case 1:
			valor = quantidade * 10;
			produto = "Cachorro quente";
			break;
		case 2:
			valor = quantidade * 15;
			produto = "X-Salada";
			break;
		case 3:
			valor = quantidade * 18;
			produto = "X-Bacon";
			break;
		case 4:
			valor = quantidade * 12;
			produto = "Bauru";
			break;
		case 5:
			valor = quantidade * 8;
			produto = "Refrigerante";
			break;
		case 6:
			valor = quantidade * 13;
			produto = "Suco de laranja";
			break;
		default:
			produto = "Não possui";
			valor = 0;
		}
		System.out.println("Produto: " + produto);
		System.out.println("Valor Total: R$" + valor);
		
		leia.close();
	}

}
