import java.util.Scanner;
public class Atividade27 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = leia.nextLine();
        System.out.println("Digite a sua idade");
        int idade = leia.nextInt();

        System.out.println("Olá "+nome + ", você tem "+idade+" anos");
    }
}
