import java.util.Scanner;
public class Atividade23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int k = leia.nextInt();
        if (k % 2 == 0){
            System.out.println("Este múmero é par");
        }else{
            System.out.println("Este número é ìmpar");
        }
    }
}
