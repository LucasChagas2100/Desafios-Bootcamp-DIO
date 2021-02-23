package FundamentosAritmeticos;

import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] valor = new int[5];
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < valor.length; i++) {
            valor[i] = ler.nextInt();
            if (valor[i]%2==0) par++;
            else impar++;
            if (valor[i]>0) positivo++;
            else if (valor[i]<0) negativo++;
        }
        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(positivo+" valor(es) positivo(s)");
        System.out.println(negativo+" valor(es) negativo(s)");
    }
}
