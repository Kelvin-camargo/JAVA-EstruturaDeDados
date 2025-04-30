public class vetor {
    int[] valor = new int[1000];
    int cont = 0;


    //adiciona um valor no arrray
    public void adicionar(int valor) {
        //verifica se o array nao esta cheio
        if (cont < this.valor.length) {
            this.valor[cont] = valor;
            cont++;
        } else {
            System.out.println("nao tem mais espaço para criar ");
        }
    }


    //faz a busca do numero pelo array
    public int buscaBinariaIterativa(int valor) {
        int inicio = 0;
        int fim = cont - 1; // marca o ultimo elemento colocado
        // onde cont representa o ultimo espaço vazil do arrei entao quando
        // colocamos cont -1 queremos pegar o ultimo numero do arrey

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (this.valor[meio] == valor) {
                return meio;
            } else if (this.valor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }


    public int buscaBinariaRecursiva(int valor) {
        return buscaBinariaRecursiva(valor, 0, cont - 1);
    }


    private int buscaBinariaRecursiva(int valor, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }
        int meio = (inicio + fim) / 2;

        if (this.valor[meio] == valor) {
            return meio;
        } else if (this.valor[meio] < valor) {
            return buscaBinariaRecursiva(valor, meio + 1, fim);
        } else {
            return buscaBinariaRecursiva(valor, inicio, meio - 1);
        }
    }
}