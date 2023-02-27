package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Escribe una frase conforme a Ascii:");
        Scanner entrada = new Scanner(System.in);
        String input = entrada.nextLine();
        System.out.println(input);
        char primera = input.charAt(0);
        int numero1 = (int) primera;
        //System.out.println(numero1);
        int x=0;
        int y=0;

        for (int i = 0; i < input.length(); i++) {

            if(x==0 && y==0) {
                x = (int) input.charAt(i);
                y = (int) input.charAt(i);
                //System.out.println(x);
            }

            if(i>0){
                y= x;
                x= (int) input.charAt(i);
                if(x-y!=1){
                    System.out.println("False");
                    break;
            }

                }
                if (input.length()-i==1){
                    System.out.println("True");
                }

        }



    }
}