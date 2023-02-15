package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();

		int n, contador = 0;

		do {
			System.out.println("Digite um numero:");
			n = leia.nextInt();
			numeros.add(n);
			contador++;
		} while (contador < 10);	
		

		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}
