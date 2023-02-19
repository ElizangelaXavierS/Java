package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int n;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		
		System.out.println("Digite o número que você deseja encontra: ");
		n = leia.nextInt();
		leia.close();
		
		for(int i = 0;  i < numeros.size(); i++) {
			if( numeros.get(i) == n) {
				System.out.println("O numero " + n + " está localizado na posição: " + i);
			}
		
		}
	
	}

}
