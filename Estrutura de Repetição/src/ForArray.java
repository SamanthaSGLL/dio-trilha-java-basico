public class ForArray {
    public static void main(String[] args){
        String alunos [] = {" FELIPE","JONAS", "JULIA", "SAMANTHA"};

        for (int x=0;x < alunos.length;x++){
            System.out.println("O aluno indice x =" + x + " é "+ alunos [ x ] );
        }
         //for each

        for (String aluno : alunos){
            System.out.println("NOme do aluno é :" + aluno);
        }
    }
}
