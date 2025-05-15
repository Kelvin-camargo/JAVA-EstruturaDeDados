public class PilhaLista implements IPilha {

    private static class No {
        Aluno aluno;
        No proximo;

        No(Aluno aluno) {
            this.aluno = aluno;
            this.proximo = null;
        }
    }

    private No topo;
    private int tamanho;

    public PilhaLista() {
        this.topo = null;
        this.tamanho = 0;
    }

    @Override
    public void empilhar(Aluno aluno) {
        No novoNo = new No(aluno);
        novoNo.proximo = topo;
        topo = novoNo;
        tamanho++;
    }

    @Override
    public Aluno desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        Aluno alunoRemovido = topo.aluno;
        topo = topo.proximo;
        tamanho--;
        return alunoRemovido;
    }

    @Override
    public Aluno topo() {
        if (estaVazia()) return null;
        return topo.aluno;
    }

    @Override
    public boolean estaVazia() {
        return topo == null;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
        No atual = topo;
        System.out.println("Estado da pilha (do topo para o fundo):");
        while (atual != null) {
            System.out.println(atual.aluno);
            atual = atual.proximo;
        }
    }
}
