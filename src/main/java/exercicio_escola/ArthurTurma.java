package exercicio_escola;

public class ArthurTurma {
	private int serie;
	private ArthurAluno[] alunos;
	private ArthurProfessor regente;

	public ArthurTurma() {
		super();
	}

	public ArthurTurma(int serie, ArthurAluno[] alunos, ArthurProfessor regente) {
		super();
		this.serie = serie;
		this.alunos = alunos;
		this.regente = regente;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public ArthurAluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(ArthurAluno[] alunos) {
		this.alunos = alunos;
	}

	public ArthurProfessor getRegente() {
		return regente;
	}

	public void setRegente(ArthurProfessor regente) {
		this.regente = regente;
	}

}
