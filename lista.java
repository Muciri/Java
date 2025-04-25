import java.util.ArrayList;
import java.util.Random;

public class lista {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        Random aleatorio = new Random();

        for(int i=0; i<10; i++){
            lista.add(aleatorio.nextInt(50));
        }

        System.out.println("lista:");
        System.out.println(lista);

        for(int i=0; i<10; i++){
            lista.set(i, lista.get(i) *2);
        }

        System.out.println("\nlista dobrada:");
        System.out.println(lista);

        lista.sort(null);

        System.out.println("\nlista ordenada");
        System.out.println(lista);
    }
}
