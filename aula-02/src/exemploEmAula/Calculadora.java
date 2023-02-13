package exemploEmAula;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		
		double n1, n2;
		
		System.out.println("Digite o 1° numero: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2° numero: ");
		n2 = leia.nextDouble();
		
		System.out.println("O numero  " + n1 + " elevadoa a numero " + n2 + " é igual a " + Math.pow(n1, n2)); 
		System.out.println("A raz quadrada do número" + n1 + " é igual a " + df.format(Math.sqrt(n1))); 
		
		
		System.out.println("Pré Incremento ");
		System.out.println(n1);
		System.out.println(++ n1);
		
		System.out.println("Pos Incremento ");
		System.out.println(n1);
		System.out.println(n1 ++);
		leia. close();
	}

}
