public class AtividadeSala02 {
    public static void main(String[] args) {
        String nome = "Leonardo";
        String sobrenome = "Keirrison";
        int idade = 16;
        double peso = 64.9;
        double altura = 1.81;
        double imc = 0;


        System.out.println(nome + " " + sobrenome);
        int anoNasc = 2025 - idade;
        System.out.println("Ano de nascimento:" + anoNasc);
        String texto = "Peso:" + peso + "; Altura:" + altura;
        System.out.println(texto);
        imc = peso/(altura*altura);
        System.out.println("IMC é:" + imc);


















    }
}
