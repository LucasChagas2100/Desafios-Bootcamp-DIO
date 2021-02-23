package FundamentosAritmeticos;

import java.io.IOException;
import java.util.Scanner;

public class ExibindoPares {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int valor = ler.nextInt();

        for (int i = 1; i <= valor; i++) {
            if (i%2==0) System.out.println(i);
        }
    }

}