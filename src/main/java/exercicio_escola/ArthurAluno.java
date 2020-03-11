package exercicio_escola;

public class ArthurAluno extends ArthurPessoa{

	public ArthurAluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArthurAluno(String nome, int idade, ArthurEndereco endereco) {
		super(nome, idade, endereco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " Nome:" + getNome() + "\n Idade=" + getIdade() + "\n Endereco=" + getEndereco();
				
	}
	
}
