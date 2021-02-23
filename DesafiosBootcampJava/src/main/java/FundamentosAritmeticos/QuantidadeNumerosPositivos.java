package FundamentosAritmeticos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuantidadeNumerosPositivos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] valores = new double[6];
        int contador = 0;

        for (int i=0; i< valores.length; i++){
            valores[i] = Double.parseDouble(br.readLine()); //lê a linha de entrada
            if (valores[i]>0){
                contador++;
            }
        }
        System.out.println(contador+ " valores positivos");
    }
}
