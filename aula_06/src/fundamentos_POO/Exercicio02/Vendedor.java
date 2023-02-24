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
		super.visualizar();
		System.out.println("Meta de venda:  " + this.metasDeVenda);
	}
	

}
