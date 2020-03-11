package exercicio_escola;

public class ArthurEscola {
	private String nome;
	private String telefone;
	private ArthurEndereco enderecoEscola;
	private ArthurTurma[] turmas;

	public ArthurEscola() {
		super();
	}

	public ArthurEscola(String nome, String telefone, ArthurEndereco enderecoEscola, ArthurTurma[] turmas) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.enderecoEscola = enderecoEscola;
		this.turmas = turmas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ArthurEndereco getEnderecoEscola() {
		return enderecoEscola;
	}

	public void setEnderecoEscola(ArthurEndereco enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}

	public ArthurTurma[] getTurmas() {
		return turmas;
	}

	public void setTurmas(ArthurTurma[] turmas) {
		this.turmas = turmas;
	}

	// M�todos
	/* A ESCOLA DEVE TER CAPACIDADE DE CONTABILIZAR SEUS ALUNOS */
	public int quantidadeAlunos() {
		int somador = 0;
		for (int i = 0; i < this.getTurmas().length; i++) {
			somador = somador + this.getTurmas()[i].getAlunos().length;
		}
		return somador;
	}

	/* A ESCOLA DEVE TER CAPACIDADE DE DADO UM REGENTE, LOCALIZAR O SEU ENDERE�O */
	public String localizaEnderecoRegente(String nome) {
		for (int i = 0; i < this.getTurmas().length; i++) {
			if (this.getTurmas()[i].getRegente().getNome().equalsIgnoreCase(nome)) {
				System.out.println(this.getTurmas()[i].getRegente().getEndereco());
			}
		}
		return nome;

	}

	// A ESCOLA DEVE TER CAPACIDADE DE DADO UMA S�RIE, LISTAR O NOME DAS ALUNAS
	// DAQUELA S�RIE.

	public void listaNomes(int serie) {
		for (int i = 0; i < this.getTurmas().length; i++) {
			for (int j = 0; j < this.getTurmas()[i].getAlunos().length; j++) {
				if (this.getTurmas()[i].getSerie() == serie) {
					System.out.println(this.getTurmas()[i].getAlunos()[j].getNome());
				}

			}
		}

	}
}
