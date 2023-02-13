package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String ani1, ani2, ani3;
		
		System.out.println("Digite o 1º animal: ");
		leia.skip("\\R?");
		ani1 = leia.nextLine();
		
		System.out.println("Digite o 2º animal: ");
		leia.skip("\\R?");
		ani2 = leia.nextLine();	
		
		System.out.println("Digite o 3º animal: ");
		leia.skip("\\R?");
		ani3 = leia.nextLine();
		
		if(ani1.equalsIgnoreCase("vertebrado")) {
			if(ani2.equalsIgnoreCase("Ave")) {
				if(ani3.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Aguia");
				}else {
					System.out.println("Pomba");					
				}
			}else {
				if(ani3.equalsIgnoreCase("Onivoro")) {
					System.out.println("Homem");
				}else {
					System.out.println("Vaca");					
				}
			}
		}else {
			if(ani2.equalsIgnoreCase("Inseto")) {
				if(ani3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Pulga");
				}else {
					System.out.println("Largata");					
				}
			}else {
				if(ani3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Sanguessuga");
				}else {
					System.out.println("Minhoca");					
				}
			}
		}
	}
}
