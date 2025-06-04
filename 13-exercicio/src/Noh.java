// Classe Noh representa cada nó da ABB
public class Noh {
    int valor;
    Noh esq;
    Noh dir;
    Noh pai;

    Noh(int valor) {
        this.valor = valor;
        this.esq = null;
        this.dir = null;
        this.pai = null;
    }
}
