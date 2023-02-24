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
		super.visualizar();
		System.out.println("Número de colaborado " + this.numeroColaborador);
	}

}
