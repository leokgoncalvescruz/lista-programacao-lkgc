import java.util.Scanner;
public class Atividade29 {



    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double a, b = 0;
        double resultado = 0;
        System.out.println("Escolha qual operação você deseja realizar:\n"+ "1 – Somar\n" +
                "2 – Subtrair\n" +
                "3 – Multiplicar\n" +
                "4 – Dividir ");
        int opcao = leia.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Você escolheu Somar");
                System.out.println("Digite o valor de a.");
                a = leia.nextDouble();
                System.out.println("Digite o valor de b.");
                b = leia.nextDouble();
                resultado = a+b;
                System.out.println("a + b = " + resultado);
            case 2:
                System.out.println("Você escolheu subtrair");
                System.out.println("Digite o valor de a.");
                a = leia.nextDouble();
                System.out.println("Digite o valor de b.");
                b = leia.nextDouble();
                resultado = a-b;
                System.out.println("a - b = "+resultado);
            case 3:
                System.out.println("Você escolheu multiplicar");
                System.out.println("Digite o valor de a.");
                a = leia.nextDouble();
                System.out.println("Digite o valor de b.");
                b = leia.nextDouble();
                resultado = a*b;
                System.out.println("a x b = "+resultado);
            case 4:
                System.out.println("Você escolheu dividir");
                System.out.println("Digite o valor de a.");
                a = leia.nextDouble();
                System.out.println("Digite o valor de b.");
                b = leia.nextDouble();
                resultado = a/b;
                System.out.println("a/b = "+resultado);

        }



    }
}
