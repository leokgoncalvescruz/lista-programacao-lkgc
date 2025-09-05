import java.util.Scanner;

public class Atividade42 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leia.nextInt();

            }
        System.out.println("Os números pares são: ");
        for (int i = 0; i < vetor.length; i++){
            if (i%2!=0){
                System.out.println(vetor[i]);
            }
        }
        }
    }
