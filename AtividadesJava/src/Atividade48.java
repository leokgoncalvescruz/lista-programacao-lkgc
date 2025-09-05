import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Atividade48 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] matriz ={
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11}
        };
        int maiorvalor = 0;
        System.out.println("Digite os valores: ");


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = leia.nextInt();
                if (matriz[i][j] > maiorvalor) maiorvalor = matriz[i][j];


            }
        }
        System.out.println("O maior valor digitado é: "+maiorvalor);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++){
                if (matriz[i][j] == maiorvalor){
                    System.out.println("Sua posição é: ["+i+"]["+j+"]");
                }
            }

        }



    }

}

