import java.util.Scanner;
public class Atividade17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = leia.nextInt();
        int quadrado = n*n;
        System.out.println("O quadrado é: "+quadrado);
    }
}