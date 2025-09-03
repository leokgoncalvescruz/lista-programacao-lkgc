import java.util.Scanner;

public class Atividade38 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número para saber a tabuada");
        int numero = leia.nextInt();
        System.out.println("A tabuada do número "+numero+" é: ");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero +"x"+i+"=" + (numero*i));

        }
    }
}
