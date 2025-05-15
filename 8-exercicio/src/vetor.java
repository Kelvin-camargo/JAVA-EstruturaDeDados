public class vetor {
        private int[] elementos;
        private int tamanho;

        public vetor(int capacidade) {
            this.elementos = new int[capacidade];
            this.tamanho = 0;
        }

        public void adiciona(int valor) {
            if (tamanho < elementos.length) {
                elementos[tamanho] = valor;
                tamanho++;
            }
        }

        public int get(int posicao) {
            return elementos[posicao];
        }

        public void set(int posicao, int valor) {
            elementos[posicao] = valor;
        }

        public int tamanho() {
            return tamanho;
        }

        public void preencherAleatorio() {
            for (int i = 0; i < elementos.length; i++) {
                elementos[i] = (int) (Math.random() * 100000);
            }
            tamanho = elementos.length;
        }

        public void bubbleSort() {
            for (int i = 0; i < tamanho - 1; i++) {
                for (int j = 0; j < tamanho - 1 - i; j++) {
                    if (elementos[j] > elementos[j + 1]) {
                        int temp = elementos[j];
                        elementos[j] = elementos[j + 1];
                        elementos[j + 1] = temp;
                    }
                }
            }
        }
}
