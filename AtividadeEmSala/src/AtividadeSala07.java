import java.sql.SQLOutput;
import java.util.Scanner;

public class AtividadeSala07 {
    public static void main(String[] args) {
        int a = 5, b = -5, x = 30, y = 9;
        if (a < 0 && b < 0 && x < 0 && y < 0){
            System.out.println("Todos os valores são negativos.");
        } else if (a < 0 || b < 0 || x < 0 || y < 0){
            System.out.println("Pelo menos um valor é negativo.");
        } else {
            System.out.println("Todos os valores são positivos.");
        }

        char oppcao = 'S';
        switch (oppcao){
            case 'S':
                System.out.println("A opção 'S' foi escolhida.");
                break;
            case 'N':
                System.out.println("A opção 'N' foi escolhida.");
                break;
            default:
                System.out.println("A opção escolhida é inválida.");
                break;}



        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = "";
        nome = leia.next();

        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        if (idade >= 18) System.out.println("Você é de maior!");

        // RESPOSTA 2
        System.out.println("Digite o sexo: (m, f)");
        char opcao = leia.next().toLowerCase().charAt(0);
        switch (opcao){
            case 'm':
                System.out.println("Masculino");
                break;
            case 'f':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção inválida");
                break;


        }











    }
}
