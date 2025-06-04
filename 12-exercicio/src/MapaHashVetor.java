public class MapaHashVetor {
    private Aluno[] vetor;

    public MapaHashVetor() {
        this.vetor = new Aluno[20];
    }

    private int hash(int chave) {
        return chave % this.vetor.length;
    }

    // Método para inserir usando endereçamento aberto (linear probing)
    public void put(int chave, Aluno valor) {
        int hash = hash(chave);
        int pos = hash;
        int tentativas = 0;

        while (vetor[pos] != null && vetor[pos].getMatricula() != chave) {
            pos = (pos + 1) % vetor.length;
            tentativas++;
            if (tentativas >= vetor.length) {
                System.out.println("Erro: Tabela cheia, não foi possível inserir o aluno " + valor.getNome());
                return;
            }
        }

        vetor[pos] = valor;
    }

    // Método para recuperar um elemento
    public Aluno get(int chave) {
        int hash = hash(chave);
        int pos = hash;
        int tentativas = 0;

        while (vetor[pos] != null) {
            if (vetor[pos].getMatricula() == chave) {
                return vetor[pos];
            }
            pos = (pos + 1) % vetor.length;
            tentativas++;
            if (tentativas >= vetor.length) {
                break;  // Evita loop infinito
            }
        }

        return null;  // Não encontrado
    }

    // Método para remover um elemento
    public Aluno remove(int chave) {
        int hash = hash(chave);
        int pos = hash;
        int tentativas = 0;

        while (vetor[pos] != null) {
            if (vetor[pos].getMatricula() == chave) {
                Aluno removido = vetor[pos];
                vetor[pos] = null;
                // Realocar elementos subsequentes para evitar quebra na cadeia de buscas
                rehash(pos);
                return removido;
            }
            pos = (pos + 1) % vetor.length;
            tentativas++;
            if (tentativas >= vetor.length) {
                break;
            }
        }

        return null;  // Não encontrado
    }

    // Método auxiliar para reorganizar a tabela após remoção
    private void rehash(int inicio) {
        int pos = (inicio + 1) % vetor.length;
        while (vetor[pos] != null) {
            Aluno temp = vetor[pos];
            vetor[pos] = null;
            put(temp.getMatricula(), temp);
            pos = (pos + 1) % vetor.length;
        }
    }

    // Exibir todos os elementos da tabela
    public void exibirTabela() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + ": " + vetor[i]);
        }
    }
}
