public class Main {
    public static void main(String[] args) {
        MapaHashVetor mapa = new MapaHashVetor();

        Aluno a1 = new Aluno(807365841, "Gabriel");
        Aluno a2 = new Aluno(478243081, "Pedro");
        Aluno a3 = new Aluno(123456789, "Maria");
        Aluno a4 = new Aluno(987654321, "Ana");

        mapa.put(a1.getMatricula(), a1);
        mapa.put(a2.getMatricula(), a2);
        mapa.put(a3.getMatricula(), a3);
        mapa.put(a4.getMatricula(), a4);

        System.out.println("Tabela após inserções:");
        mapa.exibirTabela();

        System.out.println("\nBuscar matricula 478243081: " + mapa.get(478243081));
        System.out.println("Remover matricula 807365841: " + mapa.remove(807365841));

        System.out.println("\nTabela após remoção:");
        mapa.exibirTabela();
    }
}
