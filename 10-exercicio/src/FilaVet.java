public class FilaVet implements IFila {
    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public FilaVet(int tamFila) {
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    public boolean add(Object info) {
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    public boolean remove() {
        if (this.nElemFila == 0) {
            System.out.println("Fila está vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    public boolean isEmpty() {
        return this.nElemFila == 0;
    }

    public int size() {
        return this.nElemFila;
    }

    public void imprime() {
        System.out.print("Fila: ");
        for (int i = 0; i < this.nElemFila; i++) {
            int index = (this.inicio + i) % this.vetFila.length;
            System.out.print(this.vetFila[index] + " ");
        }
        System.out.println();
    }
}
