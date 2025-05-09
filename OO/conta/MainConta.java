package OO.conta;

import OO.conta.classes.Conta;
import OO.conta.classes.ContaPF;
import OO.conta.classes.ContaPJ;

public class MainConta {
    public static void main(String[] args) {
        Conta conta1 = new ContaPF("murilo", 10);
        Conta conta2 = new ContaPF("paulo");
        Conta conta3 = new ContaPJ("roboto autopeças", 10, 2);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println("---");

        conta1.creditar(15);
        conta1.debitar(5);
        conta1.transferir(conta2, 10);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println("---");

        conta3.transferir(conta1, 5);
        conta3.transferir(conta2, 5);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println("---");
    }
}
