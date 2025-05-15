public class Main {
    public static void main(String[] args) {
        PilhaLista pilha = new PilhaLista();

        pilha.empilhar(new Aluno("Ana", 101));
        pilha.empilhar(new Aluno("Bruno", 102));
        pilha.empilhar(new Aluno("Carla", 103));

        pilha.imprimir();

        System.out.println("\nDesempilhando: " + pilha.desempilhar());

        pilha.imprimir();

        System.out.println("\nTopo atual: " + pilha.topo());
    }
}
