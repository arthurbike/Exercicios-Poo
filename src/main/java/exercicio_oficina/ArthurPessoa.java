package exercicio_oficina;

public class ArthurPessoa {
	private String nome;
	private int idade;
	private String cpf;
	private ArthurContato contato;

	public ArthurPessoa(String nome, int idade, String cpf, ArthurContato contato) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.contato = contato;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArthurContato getContato() {
		return contato;
	}

	public void setContato(ArthurContato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return nome + "\n idade: " + idade + "\n cpf: " + cpf + "\n contato: " + contato ;
	}
	

}
