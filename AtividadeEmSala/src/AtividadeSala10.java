import java.util.Scanner;
public class AtividadeSala10 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 0 a 10");
        int x = leia.nextInt(), contador = 0;


        System.out.println("A tabuada do número é:");


       while (contador <= 10){
           System.out.println(x + "*" + contador + " = " + (x * contador));
           contador++;



       }




        }
    }
