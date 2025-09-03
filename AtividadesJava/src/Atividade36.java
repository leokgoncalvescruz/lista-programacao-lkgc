import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial.");
        int n = leia.nextInt();
        int fatorial = n, contador = 1;

        while (contador < n) {
            fatorial *= (n - contador);
            contador++;

        }
        System.out.println("O valor do fatorial é: "+fatorial);
    }
}