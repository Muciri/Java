package OO.conta.classes;

public class ContaPJ extends Conta{
    //atributos
    int imposto;

    //construtores
    public ContaPJ(String nome, int saldo, int imposto){
        super(nome, saldo);
        this.imposto = imposto;
    }
    
    public ContaPJ(String nome, int imposto){
        super(nome);
        this.imposto = imposto;
    }

    //método especial da classe object
    public String toString(){
        return String.format("nome: %s | saldo: %d |imposto: %d", this.nome, this.saldo, this.imposto);
    }

    //método de polimorfismo
    @Override
    public void transferir(Conta destinatario, int valor){
        this.debitar(valor);
        destinatario.creditar(valor - imposto);
    }
}
