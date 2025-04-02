package vetor;

public class Main {

	public static void main(String[] args) {
		VetorNotasNaoOtimizado vetNotas = new VetorNotasNaoOtimizado();
		IVetorAluno vetor = new VetorAlunoNaoOtimizado(3);


		vetNotas.adiciona(9.0);
		vetNotas.adiciona(5.2);


		Aluno a1 = new Aluno("João", 101);
		Aluno a2 = new Aluno("Maria", 102);
		Aluno a3 = new Aluno("Carlos", 103);
		Aluno a4 = new Aluno("Ana", 104);

		// Adicionando alunos
		vetor.adiciona(a1);
		vetor.adiciona(a2);
		vetor.adiciona(a3);

		System.out.println("Vetor cheio? " + vetor.cheio()); // true

		// Tentando adicionar mais um aluno
		vetor.adiciona(a4); // Deve exibir "Vetor cheio!"

		// Verificando se o aluno está no vetor
		System.out.println("Vetor contém João? " + vetor.contem(a1)); // true

		// Removendo um aluno
		vetor.remove(a2);
		System.out.println("Vetor contém Maria? " + vetor.contem(a2)); // false

		System.out.println("Tamanho do vetor: " + vetor.tamanho()); // 2

	}

}
