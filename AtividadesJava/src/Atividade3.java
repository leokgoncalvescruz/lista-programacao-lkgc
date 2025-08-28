public class Atividade3 {
    public static void main(String[] args) {
        int qtdAlunos = 20;
        double mediaTurma = 78.5;
        boolean aprovado = mediaTurma>=60;
        String professor = "Victor";
        System.out.println("Quantidade de alunos: "+ qtdAlunos);
        System.out.println("Media da turma: "+ mediaTurma);
        if (mediaTurma >= 60){
            System.out.println("A turma foi aprovada? Sim");
        }else {
            System.out.println("A turma não foi aprovada");
        }
        System.out.println("Professor: "+ professor);

    }
}
