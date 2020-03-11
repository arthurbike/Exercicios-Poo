package exercicio_escola;

public class ArthurProfessor extends ArthurPessoa{
	private String disciplina;

	public ArthurProfessor() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ArthurProfessor(String nome, int idade, String disciplina, ArthurEndereco endereco) {
		super(nome, idade, endereco);
		// TODO Auto-generated constructor stub
	}



	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
