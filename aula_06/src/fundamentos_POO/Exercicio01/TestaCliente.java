package fundamentos_POO.Exercicio01;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Jose Santos", "11 98564-1285", 25, "Masculino","jose@gmail.com");
		cliente1.visualizar();
		
		Cliente cliente2 = new Cliente("Maria Silva","11 96585-3214", 45, "Feminino", "maria@gmail.com");
		cliente2.visualizar();
		
		
		PessoaFisica pf1 = new PessoaFisica("José Carlos Silva" , "11 98545-6531", 45,"Masculino", "josecarlos@gmail.com", "874.785.657.29");
		pf1.visualizar();
		
		PessoaFisica pf2 = new PessoaFisica(" Clara Soares" , "11 98545-6611", 32,"Feminino", "clarasoares@gmail.com", "812.783.617.99");
		pf2.visualizar();
		
		
		PessoaJuridica pj1 = new PessoaJuridica("Claudio  Carlos Silva" , "11 93145-7531", 65,"Masculino", "claudoiocarlos@gmail.com", "12.985.789/0001-80");
		pj1.visualizar();
		
		PessoaJuridica pj2 = new PessoaJuridica("Soraya Costa" , "11 97145-6321", 36,"Feminini", "sorayacosta@gmail.com", "12.458.632/0001-15");
		pj2.visualizar();
	}

}
