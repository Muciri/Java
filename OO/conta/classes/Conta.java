package OO.conta.classes;

public abstract class Conta {
    //atributos
    protected String nome;
    protected int saldo;

    public Conta(String nome, int saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta(String nome){
        this.nome = nome;
        this.saldo = 0;
    }

    //métodos
    public void creditar(int valor){
        this.saldo += valor;
    }

    public void debitar(int valor){
        this.saldo -= valor;
    }

    public void transferir(Conta destinatario, int valor){
        this.debitar(valor);
        destinatario.creditar(valor);
    }
}