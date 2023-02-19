package fundamentos_POO.Exercicio01;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Jose Santos", "11 98564-1285", 25, "Masculino","jose@gmail.com");
		cliente1.visualizar();
		
		Cliente cliente2 = new Cliente("Maria Silva","11 96585-3214", 45, "Feminino", "maria@gmail.com");
		cliente2.visualizar();
	}

}
