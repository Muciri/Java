package OO.aluno;

public class alunoTestar {
    public static void main(String[] args){
        aluno aluno1 = new aluno();

        aluno1.setnome("Murilo");
        aluno1.setidade(18);

        System.out.println(aluno1.getnome());
        System.out.println(aluno1.getidade());
    }
}
