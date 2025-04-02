import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Escolha uma operação:\r\n + 1. Soma (+)\r\n + 2. Subtração (-)\r\n + 3. Multiplicação (*)\r\n + 4. Divisão (/)\r\n + 5. Sair");
            int opcao, num1, num2; 
            opcao = sc.nextInt();
            if (opcao == 5){
                break; //SAIR
            }

            System.out.println("digite o primeiro número: ");
            num1 = sc.nextInt();
            System.out.println("digite o segundo número: ");
            num2 = sc.nextInt();
            
            //SOMA
            if(opcao == 1){
                System.out.println("a soma é igual a: " + (num1+num2));
            }
            
            //SUBTRAÇÃO
            else if (opcao == 2){
                System.out.println("a subtração é igual a: " + (num1-num2));
            }
            
            //MULTIPLICAÇÃO
            else if (opcao == 3){
                System.out.println("a multiplicação é igual a: " + (num1*num2));
            }
            
            //DIVISÃO
            else if (opcao == 4){
                System.out.println("a divisão é igual a: " + (num1/num2));
            }
        }
        sc.close();
    }
}