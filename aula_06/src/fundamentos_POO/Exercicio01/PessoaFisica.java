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
		System.out.println("*******************************");
		System.out.println("              DADOS            ");
		System.out.println("*******************************");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Celular: " + this.getCelular());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Genero: " + this.getGenero() );
		System.out.println("Email: " + this.getEmail());
		System.out.println("CPF: " + this.getCpf() );
		

	
	}

}
