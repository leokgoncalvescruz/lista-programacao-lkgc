import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int x = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        int y = leia.nextInt();

        int quociente = x / y;
        int resto = x % y;

        System.out.println("O quociente é: "+ quociente);
        System.out.println("O resto é: "+ resto);
    }
}