import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        int n1 = leia.nextInt();
        System.out.println("Digite a segunda nota: ");
        int n2 = leia.nextInt();
        System.out.println("digite a terceira nota: ");
        int n3 = leia.nextInt();

        int media =  (n1+n2+n3)/3;
        System.out.println("A Média das notas é: "+ media );

    }
}
