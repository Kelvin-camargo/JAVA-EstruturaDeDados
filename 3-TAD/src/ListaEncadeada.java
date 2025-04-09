public class ListaEncadeada {
    No inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void inserir(Aluno aluno) {
        No novoNo = new No(aluno);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void mostrarLista() {
        No atual = inicio;
        while (atual != null) {
            atual.aluno.mostrarInfo();
            atual = atual.proximo;
        }
    }
}