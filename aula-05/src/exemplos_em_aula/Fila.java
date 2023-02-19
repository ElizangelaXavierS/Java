package exemplos_em_aula;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Rony");
		fila.add("Lucas");
		fila.add("Isaac");
		fila.add("Fernando");
		fila.add("Laise");
		fila.add("Elizangela\n");
		
		Iterator<String> iFila = fila.iterator();
		
		while(iFila.hasNext()) {
			System.out.println(iFila.next());
			
		}
		
		System.out.println("Retira um elemento da fila");		
		System.out.println(fila.poll());
		
		System.out.println("Mostra o primeiro da fila");
		System.out.println(fila.peek());
		
		System.out.println("Tamanho da fila");
		System.out.println(fila.size());
		
		System.out.println("Fila atualizada\n");
		
		for (var elemento : fila) {
			System.out.println(elemento);
		}
		}

}
