package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.next();
		
		System.out.println("Digite o Idade do doador: ");
		idade = leia.nextInt();
				
		System.out.println("Primeira doação de sangue? ");
		doacao = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69) {
				if (doacao) {
					System.out.println(nome + " não está apto para doa sangue! ");
				}else {
					System.out.println(nome + " está apto para doa sangue! ");					
				}				
			}else { 
				System.out.println(nome + " está apto para doa sangue! ");
			}
		}else { 
			System.out.println(nome + " Não está apto para doa sangue! ");
		}
		
		leia.close();

	}

}
