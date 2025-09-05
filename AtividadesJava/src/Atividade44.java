import java.util.Scanner;

public class Atividade44 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int [] notas = new int[5];
        int soma = 0;


        System.out.println("Digite a nota dos alunos: ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = leia.nextInt();
            soma += notas[i];
        }
        double media = soma/ notas.length;
        System.out.println("A média é: "+media);
    }
}
