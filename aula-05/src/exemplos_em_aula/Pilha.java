package exemplos_em_aula;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack <String> pilha = new Stack<String>();
		
		pilha.push("Rony");
		pilha.push("Lucas");
		pilha.push("Isaac");
		pilha.push("Fernando");
		pilha.push("Laise");
		pilha.push("Elizangela");
		
		for (var elemento: pilha) { 
			System.out.println(elemento);
		}
		
		System.out.println("\nRemover o ultimo elemento da pilha");
		pilha.pop();
		
		for (var elemento: pilha) {
			System.out.println(elemento);
	}
		System.out.println("\n Topo da pilha " + pilha.peek());

}}
