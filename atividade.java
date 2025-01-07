class SalaDeAula {
	
	//variavel estatica para contar o total de alunos
	static int totalAlunos = 0;

	// metodo estatico para adc alunos
	public static void adicionarAluno() {
		totalAlunos++;
	}

	//metodo estatico para exibir o numero total de alunos
	public static void exibirTotalAlunos() {
		System.out.println("Total de alunos na sala: " + totalAlunos);
	}
}

public class atividade {
	public static void main (String[] args) {
		// criando instancias da classse sala de aula



	    // adicionando alunos

	    SalaDeAula.adicionarAluno();
	    SalaDeAula.adicionarAluno();
	    SalaDeAula.adicionarAluno();
	    SalaDeAula.adicionarAluno();
	    SalaDeAula.adicionarAluno();
	    SalaDeAula.adicionarAluno();
	    SalaDeAula.adicionarAluno();

	    // exibindo o numero total de alunos

	   SalaDeAula.exibirTotalAlunos();

	}
}