package OO.produto;

public class produto {
    //atributos
    String nome;
    String marca;
    float valor;

    //construtores
    produto(){

    }

    produto(String nome){
        this.nome = nome;
    }

    produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    produto(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}
