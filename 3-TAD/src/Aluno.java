
public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula);
    }
}
