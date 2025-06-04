public class Main {
    public static void main(String[] args) {
        ABB arvore = new ABB();

        // Inserção dos elementos
        int[] elementos = {70, 30, 12, 110, 80, 75, 9, 87, 400, 450, 2, 3};
        for (int elem : elementos) {
            arvore.inserir(elem);
        }

        // Impressão da árvore
        arvore.imprimirEmOrdem();

        // Teste de busca
        int elementoParaBuscar = 87;
        Noh resultado = arvore.buscar(elementoParaBuscar);

        if (resultado != null) {
            System.out.println("Elemento " + elementoParaBuscar + " encontrado na árvore.");
        } else {
            System.out.println("Elemento " + elementoParaBuscar + " não encontrado na árvore.");
        }
    }
}
