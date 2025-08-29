import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = leia.nextDouble();
        double farenheit = (9 * celsius) / 5 + 32;
        System.out.println("A temperatura em faremheit é: "+ farenheit);

     }
}
