package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);		
		ArrayList<String> cores = new ArrayList<String>();
		
		String cor;
		
		do {
		System.out.println("Digite uma cor:");
		cor = leia.next();		
		cores.add(cor);		
		
		}while(cores.size() < 5);
		System.out.println("\nListar todas as cores:");
		cores.forEach(System.out::println);
		cores.sort(null);
		System.out.println("\nOrdenar as cores:");
		cores.forEach(System.out::println);
		
		
		leia.close();

	}

}
