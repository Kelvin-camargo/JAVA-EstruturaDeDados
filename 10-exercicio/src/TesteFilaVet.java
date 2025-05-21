public class TesteFilaVet {
    public static void main(String[] args) {
        FilaVet fila = new FilaVet(5);

        fila.add(10);
        fila.add(20);
        fila.add(30);

        fila.imprime();  // Fila: 10 20 30

        fila.remove();
        fila.imprime();  // Fila: 20 30

        fila.add(40);
        fila.add(50);
        fila.add(60);  // Deve mostrar capacidade esgotada se tentar adicionar mais

        fila.imprime();  // Fila: 20 30 40 50

        fila.remove();
        fila.remove();
        fila.imprime();  // Fila: 40 50
    }
}
