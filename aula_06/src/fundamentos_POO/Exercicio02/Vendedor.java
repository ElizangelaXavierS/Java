package fundamentos_POO.Exercicio02;

public class Vendedor extends Funcionario {
	int metasDeVenda;

	public Vendedor(String matricula, String nome, String celular, int idade, String email, int metasDeVenda) {
		super(matricula, nome, celular, idade, email);
		this.metasDeVenda = metasDeVenda;
	}

	public int getMetasDeVenda() {
		return metasDeVenda;
	}

	public void setMetasDeVenda(int metasDeVenda) {
		this.metasDeVenda = metasDeVenda;
	}
	public void visualizar() {
		System.out.println("======================");
		System.out.println("  DADOS DO VENDENDOR  ");
		System.out.println("======================");
		System.out.println("Matricula: " + this.getMatricula());			
		System.out.println("Nome: " + this.getNome());
		System.out.println("Celular: " + this.getCelular());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Meta de venda:  " + this.getMetasDeVenda() );
	}
	

}
