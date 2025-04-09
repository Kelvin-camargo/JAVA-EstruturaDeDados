//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        Aluno a1 = new Aluno("Ana", 19);
        Aluno a2 = new Aluno("Carlos", 21);
        Aluno a3 = new Aluno("Beatriz", 20);

        lista.inserir(a1);
        lista.inserir(a2);
        lista.inserir(a3);

        lista.mostrarLista();
        }
    }
