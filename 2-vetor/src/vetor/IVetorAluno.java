package vetor;

public interface IVetorAluno {
    void adiciona(Aluno aluno);
    boolean remove(Aluno aluno);
    boolean contem(Aluno aluno);
    boolean cheio();
    int tamanho();
}