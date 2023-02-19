package fundamentos_POO.Exercicio01;

public class Cliente {
	
	private String nome;
	private String celular;
	private int idade;
	private String genero;
	private String email;
	
	public Cliente(String nome, String celular, int idade, String genero, String email) {
		super();
		this.nome = nome;
		this.celular = celular;
		this.idade = idade;
		this.genero = genero;
		this.email = email;
	}


	public void visualizar() {
		System.out.println("======================");
		System.out.println("    DADOS DO CLIENTE   ");
		System.out.println("======================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Celular: " + this.celular);
		System.out.println("Idade: " + this.idade);
		System.out.println("Genero: " + this.genero);
		System.out.println("Email: " + this.email );
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
