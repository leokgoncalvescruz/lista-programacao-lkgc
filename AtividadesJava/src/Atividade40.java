import java.util.Scanner;

public class Atividade40 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        System.out.println("Digite 5 números para saber a média aritmética: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leia.nextInt();
            soma += numeros[i];

        }
        double media = soma/numeros.length;
        System.out.println("A média artmética é: "+media);

    }
}