import java.util.Scanner;

public class Atividade43 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[8];
        int maiorNumero = 0, menorNumero = 0;


        System.out.println("Digite 8 números inteiros");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leia.nextInt();
            if (vetor[i] > maiorNumero) maiorNumero = vetor[i];
                    else if (vetor[i] < menorNumero) menorNumero = vetor[i];
        }
        System.out.println("O maior número é: "+maiorNumero);
        System.out.println("O menor número é: "+menorNumero);


    }
}


