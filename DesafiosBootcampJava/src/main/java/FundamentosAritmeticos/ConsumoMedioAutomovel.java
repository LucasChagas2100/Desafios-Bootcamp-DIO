package FundamentosAritmeticos;

import java.util.Scanner;

public class ConsumoMedioAutomovel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int distancia = ler.nextInt();
        double combustivel = ler.nextDouble();

        double consumo = distancia/combustivel;
        System.out.printf("%.3f km/l",consumo);

    }
}
