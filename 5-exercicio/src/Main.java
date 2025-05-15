public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        Aluno a1 = new Aluno("João", 101);
        Aluno a2 = new Aluno("Maria", 102);
        Aluno a3 = new Aluno("Carlos", 103);

        lista.adicionar(a1);
        lista.adicionar(a2);
        lista.adicionar(a3);

        lista.imprimirInicioFim();
        System.out.println();

        lista.imprimirFimInicio();
        System.out.println();


        boolean removido = lista.remove(102);
        System.out.println("Remoção realizada? " + removido);
        System.out.println();

        lista.imprimirInicioFim();
    }
}
