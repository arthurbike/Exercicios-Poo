package exercicio_escola;

public class ArthurExecutavel {

	public static void main(String[] args) {

		// Endere�os para alunos
		ArthurEndereco e1 = new ArthurEndereco("Rua das Jujubas", 100, "Campeche", "Florian�polis", "Santa Catarina");
		ArthurEndereco e2 = new ArthurEndereco("Rua das Gomas", 200, "Pedra Branca", "Palho�a", "Santa Catarina");
		ArthurEndereco e3 = new ArthurEndereco("Rua dos Caramelos", 300, "Kobrasol", "S�o jos�", "Santa catarina");
		ArthurEndereco e4 = new ArthurEndereco("Rua dos Pirulitos", 400, "Estreito", "Florian�polis", "Santa Catarina");
		ArthurEndereco e5 = new ArthurEndereco("Rua dos Chicletes", 500, "Ariri�", "Palho�a", "Santa Catarina");
		ArthurEndereco e6 = new ArthurEndereco("Rua dos Bombons", 600, "Forquilinhas", "S�o Jos�", "Santa Catarina");
		ArthurEndereco e7 = new ArthurEndereco("Rua das Balas", 700, "Capoeiras", "Florian�polis", "Santa Catarina");
		ArthurEndereco e8 = new ArthurEndereco("Rua das Trufas", 800, "Centro", "Bigua�u", "Santa Catarina");
		ArthurEndereco e9 = new ArthurEndereco("Rua dos Doces", 900, "Campinas", "S�o jos�", "Santa Catarina");
		ArthurEndereco e10 = new ArthurEndereco("Rua dos Confetes", 1000, "Capoeiras", "Florian�polis",
				"Santa Catarina");

		// Endere�os para professores
		ArthurEndereco e11 = new ArthurEndereco("Rua das Enciclop�dias", 500, "Centro", "Florian�polis",
				"Santa Catarina");
		ArthurEndereco e12 = new ArthurEndereco("Rua dos Dicion�rios", 750, "Centro", "Florian�polis",
				"Santa Catarina");

		// Endereco para escola
		ArthurEndereco e13 = new ArthurEndereco("Rua dos Estudos", 1000, "Centro", "Florian�polis", "Santa Catarina");

		// Alunos
		ArthurAluno a1 = new ArthurAluno("Juliana Silva", 15, e1);
		ArthurAluno a2 = new ArthurAluno("Daniele Veiga", 14, e2);
		ArthurAluno a3 = new ArthurAluno("Bruna Andrade", 13, e3);
		ArthurAluno a4 = new ArthurAluno("Helena de Andrade", 16, e4);
		ArthurAluno a5 = new ArthurAluno("Mary Souza", 15, e5);
		ArthurAluno a6 = new ArthurAluno("Paula Vieira", 14, e6);
		ArthurAluno a7 = new ArthurAluno("Renata Augusta", 15, e7);
		ArthurAluno a8 = new ArthurAluno("Luiza Pirez", 15, e8);
		ArthurAluno a9 = new ArthurAluno("Beatriz Santos", 14, e9);
		ArthurAluno a10 = new ArthurAluno("Suellen Lima", 17, e10);

		// Professores para as turmas
		ArthurProfessor p1 = new ArthurProfessor("Zeca", 45, "Matem�tica", e11);
		ArthurProfessor p2 = new ArthurProfessor("Pires", 40, "Portugu�s", e12);

		// Array de alunos para turma
		ArthurAluno[] alunosTurmaA = { a1, a2, a3, a4, a5,  };
		ArthurAluno[] alunosTurmaB = { a6, a7, a8, a9, a10 };

		// Turmas (p/ alunos)
		ArthurTurma A = new ArthurTurma(7, alunosTurmaA, p1);
		ArthurTurma B = new ArthurTurma(8, alunosTurmaB, p2);

		// Array de turmas para escola
		ArthurTurma[] turmas = { A, B };

		// Escola
		ArthurEscola escola = new ArthurEscola("Escola B�sica das Meninas de Florian�polis", "3232-3232", e13, turmas);

		System.out.print("Quantidade de alunos: ");
		System.out.println(escola.quantidadeAlunos());
		System.out.println("----------------------------------------");
		System.out.println("Endere�o do regente: ");
		System.out.println(escola.localizaEnderecoRegente("Zeca"));
		System.out.println("----------------------------------------");
		escola.listaNomes(8);
	}

}
