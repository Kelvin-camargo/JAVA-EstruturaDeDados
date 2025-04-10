public class No {
    Object dado;
    No anterior;
    No proximo;

    public No(Object dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}