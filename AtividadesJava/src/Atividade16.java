import java.util.Scanner;
public class Atividade16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número");

        int x = leia.nextInt();
        x = x*=x;
        System.out.println("O quadrado do múmero é: "+x);
    }
}
