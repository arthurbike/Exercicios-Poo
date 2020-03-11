package exercicio_escola;

public abstract class ArthurPessoa {
	private String nome;
	private int idade;
	private ArthurEndereco endereco;

	public ArthurPessoa(String nome, int idade, ArthurEndereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public ArthurPessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ArthurEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(ArthurEndereco endereco) {
		this.endereco = endereco;
	}

}
