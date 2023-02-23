package fundamentos_POO.Exercicio02;

public class Gerente extends Funcionario {
	int numeroColaborador;
	

	public Gerente(String matricula, String nome, String celular, int idade, String email, int numeroColaborador) {
		super(matricula, nome, celular, idade, email);
		this.numeroColaborador = numeroColaborador;
	}

	public int getNumeroColaborador() {
		return numeroColaborador;
	}

	public void setNumeroColaborador(int numeroColaborador) {
		this.numeroColaborador = numeroColaborador;


	
	}
	

	public void visualizar() {
		System.out.println("======================");
		System.out.println("    DADOS DO GERENTE  ");
		System.out.println("======================");
		System.out.println("Matricula: " + this.getMatricula());			
		System.out.println("Nome: " + this.getNome());
		System.out.println("Celular: " + this.getCelular());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Número de colaborado " + this.getNumeroColaborador() );
	}

}
