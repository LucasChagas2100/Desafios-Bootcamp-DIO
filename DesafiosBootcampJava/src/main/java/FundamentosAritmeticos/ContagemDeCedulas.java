package FundamentosAritmeticos;

import java.util.Scanner;

public class ContagemDeCedulas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor = ler.nextInt();
        int notaCem=0, notaCinquenta=0, notaVinte=0, notaDez=0, notaCinco=0, notaDois=0, notaUm=0 ;
        int valorTotal = valor;
        if (valor>=100){
            notaCem = valor/100;
            valor = valor%100;
        }
        if (valor>=50){
            notaCinquenta = valor/50;
            valor = valor%50;
        }
        if (valor>=20){
            notaVinte = valor/20;
            valor = valor%20;
        }
        if (valor>=10){
            notaDez = valor/10;
            valor = valor%10;
        }
        if (valor>=5){
            notaCinco = valor/5;
            valor = valor%5;
        }
        if (valor>=2){
            notaDois = valor/2;
            valor = valor%2;
        }
        if (valor==1){
            notaUm = valor/1;
            valor = valor%1;
        }

        System.out.println(valorTotal);
        System.out.println(notaCem+" nota(s) de R$ 100,00");
        System.out.println(notaCinquenta+" nota(s) de R$ 50,00");
        System.out.println(notaVinte+" nota(s) de R$ 20,00");
        System.out.println(notaDez+" nota(s) de R$ 10,00");
        System.out.println(notaCinco+" nota(s) de R$ 5,00");
        System.out.println(notaDois+" nota(s) de R$ 2,00");
        System.out.println(notaUm+" nota(s) de R$ 1,00");

    }
}
