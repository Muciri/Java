package OO.conta.classes;

public class ContaPF extends Conta{
    //construtores
    public ContaPF(String nome, int saldo){
        super(nome, saldo);
    }

    public ContaPF(String nome){
        super(nome);
    }

    //método especial da classe object
    public String toString(){
        return String.format("nome: %s | saldo: %d", this.nome, this.saldo);
    }
}
