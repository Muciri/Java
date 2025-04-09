package OO.carro;

public class carroTeste {
    public static void main(String[] args){
        carro c1 = new carro();

        c1.nome = "supra";
        c1.marca = "toyota";
        c1.ano = 1978;
        c1.vel = 100;

        System.out.printf("velocidade: %d km/h\n", c1.vel);
        c1.acelerar(50);
        System.out.printf("velocidade: %d km/h\n", c1.vel);

        System.out.println("freiando...");
        c1.frear(30);
        System.out.printf("velocidade: %d km/h\n", c1.vel);
    }
}
