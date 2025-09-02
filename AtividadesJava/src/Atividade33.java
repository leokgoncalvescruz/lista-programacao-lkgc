import java.util.Scanner;
public class Atividade33 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 0;
        int soma = 0;
        double contador = 0;

        do {
            System.out.println("Digite a idade");
            idade = leia.nextInt();
            if (idade > 0) {
                soma += idade;
                contador++;
            }
        } while (idade >= 0);
        System.out.println("A média das idades é: "+(soma/contador));

    }
}
