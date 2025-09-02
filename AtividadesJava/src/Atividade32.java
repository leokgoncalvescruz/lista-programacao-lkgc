import java.util.Scanner;
public class Atividade32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int senha = 0;
        do {
            System.out.println("Digite a senha de 4 dígitos");
            senha = leia.nextInt();

        }while (senha != 1234);
        System.out.println("Acesso permitido");
    }
}
