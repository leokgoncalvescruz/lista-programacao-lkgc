import java.util.Scanner;
public class Atividade24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = leia.nextInt();
        if (numero * numero > 100){
            System.out.println("Quadrado calculado: " + numero*numero);
        }else{
            System.out.println("Quadrado pequeno ou igual a 100");
        }
    }
}
