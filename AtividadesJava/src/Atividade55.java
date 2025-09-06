import java.util.Scanner;

public class Atividade55 {
    public static int fatorial(int valor){
        if (valor == 0)
            return 1;
        else
            return valor * fatorial(valor -1);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = 0;
        int f = 1;
        System.out.println("Digite um número para saber o fatorial");
        n = leia.nextInt();

        System.out.println("O fatorial é: "+fatorial(n));
    }
}
