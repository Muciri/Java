import java.util.Scanner;

class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("digite o segundo número: ");
        num2 = sc.nextInt();
        System.out.println("a soma é igual a: " + (num1+num2));
        
        sc.close();
    }
}