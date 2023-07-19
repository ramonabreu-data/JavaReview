package org.example;

import java.util.Locale;

public class SaidaDeDados_03 {

    public static void  SaidaDeDados_03(String []args){

        System.out.println("Primeira Saída");

        int numeroTeste = 28;
        System.out.println(numeroTeste);


        //para ponto flutuante:
        double saidaFlutuante = 10.54886;
        System.out.println(saidaFlutuante);

        //para flutuante formatado:
        //2 casas
        System.out.printf("%.2f%n",saidaFlutuante);

        //4 casas
        System.out.printf("%.4f%n",saidaFlutuante);

        //para sepasador usa
        Locale.setDefault(Locale.US);

        //2 casas usa
        System.out.printf("%.2f%n",saidaFlutuante);

        //4 casas usa
        System.out.printf("%.4f%n",saidaFlutuante);

        //para concatenar elementos:

        System.out.println("Eu tennho em conta: " + saidaFlutuante + " em Dólares ");

        //concatenando com printf

        System.out.printf("Eu tenho mais de %f em dólares", saidaFlutuante);


    }

}
