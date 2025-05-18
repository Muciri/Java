package OO.conta;

import OO.conta.classes.Conta;
import OO.conta.classes.ContaPF;

import java.util.ArrayList;
import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaPF> lista = new ArrayList<ContaPF>();

        while(true){
            System.out.println("o que deseja fazer? \n[1]criar conta\n[2]remover conta\n[3]ver contas\n[4]creditar\n[5]debitar\n[6]transferir\n[7]sair");
            int opcao = sc.nextInt();

            if(opcao == 1){
                System.out.print("qual o nome da conta? ");
                String nome = sc.next();
                System.out.print("\nqual o saldo? ");
                int saldo = sc.nextInt();

                ContaPF contanova = new ContaPF(nome, saldo);
                lista.add(contanova);
                System.out.println(contanova);
            }

            else if(opcao == 2){
                System.out.println("qual o index da conta? ");
                int conta = sc.nextInt();

                lista.remove(conta);
            }

            else if(opcao == 3){
                System.out.println(lista);
            }

            else if(opcao == 4){
                System.out.println("qual o index da conta? ");
                int conta = sc.nextInt();
                System.out.println("quanto deseja creditar? ");
                int valor = sc.nextInt();

                lista.get(conta).creditar(valor);
            }

            else if(opcao == 5){
                System.out.println("qual o index da conta? ");
                int conta = sc.nextInt();
                System.out.println("quanto deseja debitar? ");
                int valor = sc.nextInt();

                lista.get(conta).debitar(valor);
            }

            else if(opcao == 6){
                System.out.println("qual o index da conta remetente? ");
                int conta1 = sc.nextInt();
                ContaPF contaRemetente = lista.get(conta1);

                System.out.println("qual o index da conta destinatário? ");
                int conta2 = sc.nextInt();
                ContaPF contaDestinatario = lista.get(conta2);

                System.out.println("quanto deseja transferir? ");
                int valor = sc.nextInt();

                contaRemetente.transferir(contaDestinatario, valor);
            }

            else if(opcao == 7){
                break;
            }
        }
    }
}