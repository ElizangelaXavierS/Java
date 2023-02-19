package fundamentos_POO.Exercicio02;

public class Funcionario {

	private String matricula;
	private String nome;
	private String celular;
	private int idade;
	private String email;
	
	public Funcionario(String matricula, String nome, String celular, int idade, String email) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.celular = celular;
		this.idade = idade;
		this.email = email;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void visualizar() {
		System.out.println("===========================");
		System.out.println("    DADOS DO FUNCIONARIO   ");
		System.out.println("===========================");
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Nome: " + this.nome);
		System.out.println("Celular: " + this.celular);
		System.out.println("Idade: " + this.idade);
		System.out.println("Email: " + this.email );
		
	}

}
