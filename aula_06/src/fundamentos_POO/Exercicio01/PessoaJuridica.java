package fundamentos_POO.Exercicio01;

public class PessoaJuridica extends Cliente{
	
	 private String cnpj;

	public PessoaJuridica(String nome, String celular, int idade, String genero, String email, String cnpj) {
		super(nome, celular, idade, genero, email);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void visualizar() {
		System.out.println("**************************");
		System.out.println("            DADOS         ");
		System.out.println("**************************");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Celular: " + this.getCelular());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Genero: " + this.getGenero() );
		System.out.println("Email: " + this.getEmail());
		System.out.println("CNPJ: " + this.getCnpj() );
	
	}

}
