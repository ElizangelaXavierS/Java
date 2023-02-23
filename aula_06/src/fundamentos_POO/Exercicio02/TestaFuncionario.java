package fundamentos_POO.Exercicio02;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario01 = new Funcionario("140241", "Carlos Santiago", "11 96541-4585", 29, "carlossantiago@gmail.com");
		funcionario01.visualizar();
		
		
		Funcionario funcionario02 = new Funcionario("143245", "Sofia Vasconcelos", "11 96589-2145", 19, "vasconsofia@gmail.com");
		funcionario02.visualizar();
		
		
		Gerente g1= new Gerente("652245", "Gabriel santana", "11 96789-2145", 65, "gabriel@gmail.com", 450);
		g1.visualizar();
		
		Gerente g2= new Gerente("485245", " Gabriela Santana", "11 96129-2145", 45, "gabriela@gmail.com", 455);
		g2.visualizar();
		
		
		Vendedor v1= new Vendedor ("485245", " Pedro Vasconcelos", "11 96129-2005", 34, "pedrp@gmail.com", 40000000);
		v1.visualizar();
		
		Vendedor v2= new Vendedor ("365245", " Pietra Vasconcelos", "11 91029-2005", 40, "pietra@gmail.com", 500000000);
		v2.visualizar();
		

	}

}
