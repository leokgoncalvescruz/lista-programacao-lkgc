import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int maior = 0;


        while (true) {
            System.out.print("Digite um número inteiro (-1 para encerrar): ");
            numero = leia.nextInt();

            if (numero == -1) {
                break;
            }

            if (numero != -1) {
                maior = numero;

            } else if (numero > maior) {
                maior = numero;
            }
        }

            System.out.println("O maior número digitado foi: " + maior);
        }
    }
