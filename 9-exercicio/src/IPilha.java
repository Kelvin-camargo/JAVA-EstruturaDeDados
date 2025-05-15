public interface IPilha {
    void empilhar(Aluno aluno);
    Aluno desempilhar();
    Aluno topo();
    boolean estaVazia();
    int tamanho();
    void imprimir();
}
