import entidades.Triangulo;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo de triangulos");
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite os Valores do Triangulo x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os Valores do Triangulo y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = y.area();

        System.out.printf("%nA area do triangulo x é: %.2f%nA area do triangulo y é: %.2f%n", areax, areay);

        if(areax > areay){
            System.out.println("A area do triangulo X é maior");

        }else if(areay > areax){
            System.out.println("A area do triangulo Y é maior");

        }else if(areax == areay){
            System.out.println("A area dos triangulos são equivalentes");
        }else{
            System.out.println("Algo deu errado :(");
        }
        System.out.println("Até a próxima...");


        sc.close();
    }
}
