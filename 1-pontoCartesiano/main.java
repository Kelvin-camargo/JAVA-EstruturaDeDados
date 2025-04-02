import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double x, y;


    System.out.println("coordenadas ponto 1: ");
    x = input.nextDouble();
    y = input.nextDouble();

    PontoCartesiano ponto1 = new PontoCartesiano(x, y);



    System.out.println("coordenadas ponto 2: ");
    x = input.nextDouble();
    y = input.nextDouble();

    PontoCartesiano ponto2 = new PontoCartesiano(x, y);
    

    }

}