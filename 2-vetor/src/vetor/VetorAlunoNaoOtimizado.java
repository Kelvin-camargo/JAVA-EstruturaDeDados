package vetor;

public class VetorAlunoNaoOtimizado implements IVetorAluno {
    private Aluno[] alunos;
    private int totalAlunos;

    public VetorAlunoNaoOtimizado(int capacidade) {
        this.alunos = new Aluno[capacidade];
        this.totalAlunos = 0;
    }


    public void adiciona(Aluno aluno) {
        if (!cheio()) {
            alunos[totalAlunos] = aluno;
            totalAlunos++;
        } else {
            System.out.println("Vetor cheio! Não é possível adicionar mais alunos.");
        }
    }


    public boolean remove(Aluno aluno) {
        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].equals(aluno)) {
                for (int j = i; j < totalAlunos - 1; j++) {
                    alunos[j] = alunos[j + 1];
                }
                alunos[totalAlunos - 1] = null;
                totalAlunos--;
                return true;
            }
        }
        return false;
    }


    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }


    public boolean cheio() {
        return totalAlunos == alunos.length;
    }


    public int tamanho() {
        return totalAlunos;
    }
}