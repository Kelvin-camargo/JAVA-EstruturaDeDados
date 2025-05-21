public class FilaLista implements IFila {
    private Noh inicio;
    private Noh fim;
    private int tamanho;

    public FilaLista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    @Override
    public boolean add(Object info) {
        Noh novo = new Noh(info);
        if (isEmpty()) {
            inicio = novo;
        } else {
            fim.setProx(novo);
        }
        fim = novo;
        tamanho++;
        return true;
    }

    @Override
    public boolean remove() {
        if (!isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.getProx();
            }
            tamanho--;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return inicio == null && fim == null;
    }

    @Override
    public int size() {
        return tamanho;
    }

    // Método de impressão do estado da fila
    public void imprime() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.print("Fila: ");
        Noh aux = inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }
}
