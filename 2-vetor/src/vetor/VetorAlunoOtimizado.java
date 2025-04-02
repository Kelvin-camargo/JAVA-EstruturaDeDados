package vetor;

public class VetorAlunoOtimizado implements vetor.IVetorAluno {
    private vetor.Aluno[] alunos;
    private int totalAlunos;

    public VetorAlunoOtimizado(int capacidadeInicial) {
        this.alunos = new Aluno[capacidadeInicial];
        this.totalAlunos = 0;
    }


    public void adiciona(Aluno aluno) {
        if (cheio()) {
            redimensionar();
        }
        alunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    private void redimensionar() {
        int novaCapacidade = alunos.length * 2;
        Aluno[] novoArray = new Aluno[novaCapacidade];


        for (int i = 0; i < alunos.length; i++) {
            novoArray[i] = alunos[i];
        }

        this.alunos = novoArray;
        System.out.println(novaCapacidade );
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

    public boolean contem(vetor.Aluno aluno) {
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