import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int base = leia.nextInt();
        System.out.println("Digite a altura: ");
        int altura = leia.nextInt();
        int perimetro = 2 * (base+altura);
        System.out.println("O perímetro é: "+ perimetro);
    }
}
