public class Main {
    public static void main(String[] args) {
        int[] tamanhos = {1000, 10000, 100000};

        for (int tamanho : tamanhos) {
            vetor vetor = new vetor(tamanho);
            vetor.preencherAleatorio();

            System.out.println("Ordenando vetor de tamanho: " + tamanho);
            long inicio = System.currentTimeMillis();

            vetor.bubbleSort();

            long fim = System.currentTimeMillis();
            System.out.println("Tempo: " + (fim - inicio) + " ms\n");
        }
    }
}
