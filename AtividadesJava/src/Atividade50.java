import java.util.Scanner;

public class Atividade50 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] matriz1 = new int[3][3], matriz2 = new int[3][3];


        System.out.println("Digite os valores da primeira matriz");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = leia.nextInt();
            }
        }
        System.out.println("O quadrado dessa matriz é: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = matriz1[i][j] * matriz1[i][j];
                System.out.println(matriz2[i][j]);
            }
        }

    }
}
