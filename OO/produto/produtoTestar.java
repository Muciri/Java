package OO.produto;

public class produtoTestar {
    public static void main(String[] args){
        produto p1 = new produto();
        p1.nome = "apontador";
        p1.marca = "Bic";
        p1.valor = 1.60f;

        produto p2 = new produto("caneta");
        p2.marca = "Bic";
        p2.valor = 1f;

        produto p3 = new produto("borracha", "Faber");
        p3.valor = 2f;

        produto p4 = new produto("lapis", "Brasil", 1.50f);

        //printando
        System.out.printf("nome: %s, marca: %s, valor: %f\n", p1.nome, p1.marca, p1.valor);
        System.out.printf("nome: %s, marca: %s, valor: %f\n", p2.nome, p2.marca, p2.valor);
        System.out.printf("nome: %s, marca: %s, valor: %f\n", p3.nome, p3.marca, p3.valor);
        System.out.printf("nome: %s, marca: %s, valor: %f\n", p4.nome, p4.marca, p4.valor);
    }
}
