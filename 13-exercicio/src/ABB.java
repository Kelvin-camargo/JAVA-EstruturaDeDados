// Classe ABB representa a Árvore Binária de Busca
public class ABB {
    private Noh raiz;

    public ABB() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return this.raiz == null;
    }

    // Método de inserção recursiva
    public void inserir(int elemento) {
        if (isEmpty()) {
            this.raiz = new Noh(elemento);
        } else {
            inserirRec(this.raiz, elemento);
        }
    }

    private void inserirRec(Noh atual, int elemento) {
        if (elemento < atual.valor) {
            if (atual.esq == null) {
                Noh novo = new Noh(elemento);
                atual.esq = novo;
                novo.pai = atual;
            } else {
                inserirRec(atual.esq, elemento);
            }
        } else {
            if (atual.dir == null) {
                Noh novo = new Noh(elemento);
                atual.dir = novo;
                novo.pai = atual;
            } else {
                inserirRec(atual.dir, elemento);
            }
        }
    }

    // Método de busca
    public Noh buscar(int elemento) {
        return buscarRec(this.raiz, elemento);
    }

    private Noh buscarRec(Noh atual, int elemento) {
        if (atual == null || atual.valor == elemento) {
            return atual;
        }

        if (elemento < atual.valor) {
            return buscarRec(atual.esq, elemento);
        } else {
            return buscarRec(atual.dir, elemento);
        }
    }

    // Método de impressão (em-ordem)
    public void imprimirEmOrdem() {
        System.out.print("Árvore em-ordem: ");
        imprimirEmOrdemRec(this.raiz);
        System.out.println();
    }

    private void imprimirEmOrdemRec(Noh atual) {
        if (atual != null) {
            imprimirEmOrdemRec(atual.esq);
            System.out.print(atual.valor + " ");
            imprimirEmOrdemRec(atual.dir);
        }
    }
}

