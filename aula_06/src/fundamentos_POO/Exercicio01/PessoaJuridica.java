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
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	
	}

}
