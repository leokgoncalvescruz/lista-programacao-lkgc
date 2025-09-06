import java.util.Scanner;

public class Atividade52 {
    public static double faren(double x) {
        return (9 * x) / 5 + 32;
    }


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double celsius = 0;
        System.out.println("Digite a temperatura em celsius");
        celsius = leia.nextDouble();
        System.out.println("A temperatura em farenheit é: " + faren(celsius));

    }
}