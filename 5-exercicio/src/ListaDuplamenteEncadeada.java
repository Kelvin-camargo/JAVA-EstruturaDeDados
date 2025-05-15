public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionar(Object dado) {
        No novo = new No(dado);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }


    public No buscar(int matricula) {
        No atual = inicio;
        while (atual != null) {
            if (atual.dado instanceof Aluno) {
                Aluno a = (Aluno) atual.dado;
                if (a.getMatricula() == matricula) {
                    return atual;
                }
            }
            atual = atual.proximo;
        }
        return null;
    }


    public boolean remove(int matricula) {
        No alvo = buscar(matricula);
        if (alvo == null) return false;

        if (alvo.anterior != null) {
            alvo.anterior.proximo = alvo.proximo;
        } else {
            inicio = alvo.proximo;
        }

        if (alvo.proximo != null) {
            alvo.proximo.anterior = alvo.anterior;
        } else {
            fim = alvo.anterior;
        }

        return true;
    }


    public void imprimirInicioFim() {
        No atual = inicio;
        System.out.println("Lista do início ao fim:");
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }


    public void imprimirFimInicio() {
        No atual = fim;
        System.out.println("Lista do fim ao início:");
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.anterior;
        }
    }
}
