import java.util.Scanner;

public class Atividade54 {
    public static double media(double x,double y, double z){
        return (x+y+z)/3;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1 = 0, n2 = 0, n3 = 0;
        System.out.println("Digite a primeira nota do aluno: ");
        n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        n2 = leia.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        n3 = leia.nextDouble();

        System.out.println("A média de notas do aluno é: "+media(n1,n2,n3));



    }
}
