package fundamentos_POO.Exercicio01;

public class PessoaFisica extends Cliente{
	
	private String cpf;

	public PessoaFisica(String nome, String celular, int idade, String genero, String email, String cpf) {
		super(nome, celular, idade, genero, email);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
		

	
	}

}
