import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de area de dois triangulos");
        System.out.println("Digite os lados do cateto oposto, cateto adjaceste e hipotenusa sendo respectivamente A, B e C");

        System.out.println("Digita os valores do triangulo X");
        System.out.println("triangulo XA:");
        double xa = sc.nextDouble();
        System.out.println("triangulo XB:");
        double xb = sc.nextDouble();
        System.out.println("triangulo XC:");
        double xc = sc.nextDouble();

        System.out.println("Digita os valores do triangulo Y");
        System.out.println("triangulo YA:");
        double ya = sc.nextDouble();
        System.out.println("triangulo YB:");
        double yb = sc.nextDouble();
        System.out.println("triangulo YC:");
        double yc = sc.nextDouble();

        //fazendo os calculos
    double px = (xa + xb + xc) / 2;
    double areax = Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));

    double py = (ya + yb + yc) / 2;
    double areay = Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));

        System.out.printf("%nA área do triangulo X é: %.2f%nA área do triangulo Y é: %.2f%n", areax, areay);

        //comparação
        if(areax > areay){
            System.out.println("area do triangulo x é maior");
        }else if(areay > areax){
            System.out.println("area do triangulo y é maior");
        }else{
            System.out.println("Os triangulos são equivalentes");
        }


        sc.close();
    }
}
