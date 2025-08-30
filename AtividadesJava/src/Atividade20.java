import java.util.Scanner;
public class Atividade20 {
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      boolean temCNH = false;

        System.out.println("Digite a sua idade.");
        int idade = leia.nextInt();
        if (idade < 18){
            System.out.println("Você não pode dirigir.");
            return;
        }else{
            System.out.println("Você tem CNH ?");
            temCNH = leia.nextBoolean();
        }if(temCNH = true){
            System.out.println("Você pode dirigir");
        }
    }
}
