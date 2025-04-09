package OO.aluno;

public class aluno {
    private String nome;
    private int idade;

    public String getnome(){
        return this.nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public int getidade(){
        return this.idade;
    }

    public void setidade(int idade){
        if (idade < 120 || idade > 0){
            this.idade = idade;
        } 
        else{
            System.out.println("idade inválida");
        }
    }
}
