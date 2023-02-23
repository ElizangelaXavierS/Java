package fundamentos_POO.Exercicio03;

public class Produto {
	private String nome;
	private String descricao;
	private String categoria;
	private float valor;
	private int quantidade;
	
	
	public Produto(String nome, String descricao, String categoria, float valor, int quantidade) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.valor = valor;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void visualizar() {
		System.out.println("===========================");
		System.out.println("     DADOS DO PRODUTO      ");
		System.out.println("===========================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Categoria" + this.categoria);
		System.out.println("Valor: " + this.valor);
		System.out.println("Quantidade: " + this.quantidade );
		
	}


}

