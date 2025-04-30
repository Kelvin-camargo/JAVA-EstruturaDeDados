public class Main {
    public static void main(String[] args) {
        vetor v = new vetor();

        // Populando o vetor com os números de 1 a 1000
        for (int i = 1; i <= 1000; i++) {
            v.adicionar(i);
        }

        int numeroProcurado = 1000;

        // Medindo tempo da busca iterativa
        long inicioIterativa = System.nanoTime();
        int resultadoIterativa = v.buscaBinariaIterativa(numeroProcurado);
        long fimIterativa = System.nanoTime();

        System.out.println("Iterativa - Índice encontrado: " + resultadoIterativa);
        System.out.println("Tempo (iterativa): " + (fimIterativa - inicioIterativa) + " ns");

        // Medindo tempo da busca recursiva
        long inicioRecursiva = System.nanoTime();
        int resultadoRecursiva = v.buscaBinariaRecursiva(numeroProcurado);
        long fimRecursiva = System.nanoTime();

        System.out.println("Recursiva - Índice encontrado: " + resultadoRecursiva);
        System.out.println("Tempo (recursiva): " + (fimRecursiva - inicioRecursiva) + " ns");
    }

}