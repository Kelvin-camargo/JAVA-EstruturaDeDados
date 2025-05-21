public class Main {
    public static void main(String[] args) {
        IFila fila = new FilaLista();

        // Adicionando alunos (pode ser nome ou objeto Aluno se quiser implementar)
        fila.add("Alice");
        fila.add("Bruno");
        fila.add("Carlos");

        // Imprimindo o estado da fila
        ((FilaLista) fila).imprime();

        // Removendo um elemento
        fila.remove();
        ((FilaLista) fila).imprime();

        // Tamanho da fila
        System.out.println("Tamanho da fila: " + fila.size());
    }
}
