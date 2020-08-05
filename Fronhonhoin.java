package fronhonhoin;

import java.util.Scanner;

public class Fronhonhoin {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int p1, p2, p3, quantum;
        int acumulador1 = 0, acumulador2 = 0, acumulador3 = 0;
        int TT1 = 0, TT2 = 0, TT3 = 0;

        System.out.println("Digite o tempo do 1° processo\n");
        p1 = ler.nextInt();
        System.out.println("Digite o tempo do 2° processo\n");
        p2 = ler.nextInt();
        System.out.println("Digite o tempo do 3° processo\n");
        p3 = ler.nextInt();
        System.out.println("Digite o tempo do Quantum\n");
        quantum = ler.nextInt();
  
        
          // Verificando qual é o maior número 
            int maior = p1;
            if (p1 >= p2 && p1>= p3){
                maior = p1;
            }
            if(p2 >= p1 && p2 >= p3){
                maior = p2;
            }
            if(p3 >= p1 && p3>= p2){
                maior = p3;
            }
    
        //dividir o maior número pelo Quantum para obter as repetições corretas.
        
         
        if (maior % quantum != 0){
            maior = maior + 1;
            
        }else {
             maior = maior/quantum;
        }
        
        for (int i = 0; i < maior; i++) {
            
            //========================================================================================================================
            if (acumulador1 < p1 && acumulador1 + quantum <= p1) {
                acumulador1 = acumulador1 + quantum;
                TT1 = TT1 + quantum;

                if (acumulador2 < p2 && acumulador2 > 0) {
                    TT2 = TT2 + quantum;
                }
                if (acumulador3 < p3 && acumulador3 > 0) {
                    TT3 = TT3 + quantum;

                }

            } else if ((p1 - acumulador1) + acumulador1 == p1 && p1 != acumulador1) {

                TT1 = (p1 - acumulador1) + TT1;

                if (acumulador2 < p2 && acumulador2 > 0) {
                    TT2 = (p1 - acumulador1) + TT2;
                }
                if (acumulador3 < p3 && acumulador3 > 0) {
                    TT3 = (p1 - acumulador1) + TT3;
                }
                acumulador1 = (p1 - acumulador1) + acumulador1;

            }
            //===========================================================================================================================
            if (acumulador2 < p2 && acumulador2 + quantum <= p2) {
                acumulador2 = acumulador2 + quantum;
                TT2 = TT2 + quantum;

                if (acumulador1 < p1 && acumulador1 > 0) {
                    TT1 = TT1 + quantum;
                }
                if (acumulador3 < p3 && acumulador3 > 0) {
                    TT3 = TT3 + quantum;
                }

            } else if ((p2 - acumulador2) + acumulador2 == p2 && p2 != acumulador2) {
                if (acumulador1 < p1 && acumulador1 > 0) {
                    TT1 = (p2 - acumulador2) + TT1;
                }
                if (acumulador3 < p3 && acumulador3 > 0) {
                    TT3 = (p2 - acumulador2) + TT3;
                }

                TT2 = (p2 - acumulador2) + TT2;
                acumulador2 = (p2 - acumulador2) + acumulador2;

            }
            //=============================================================================================================================
            if (acumulador3 < p3 && acumulador3 + quantum <= p3) {
                acumulador3 = acumulador3 + quantum;
                TT3 = TT3 + quantum;

                if (acumulador2 < p2 && acumulador2 > 0) {
                    TT2 = TT2 + quantum;
                }
                if (acumulador1 < p1 && acumulador1 > 0) {
                    TT1 = TT1 + quantum;
                }

            } else if ((p3 - acumulador3) + acumulador3 == p3 && p3 != acumulador3) {

                if (acumulador1 < p1 && acumulador1 > 0) {
                    TT1 = (p3 - acumulador3) + TT1;

                }
                if (acumulador2 < p2 && acumulador2 > 0) {
                    TT2 = (p3 - acumulador3) + TT2;
                }

                TT3 = (p3 - acumulador3) + TT3;

                acumulador3 = (p3 - acumulador3) + acumulador3;

            }
            //====================================================================================================================
        }
        
        System.out.printf("TEMPO TOTAL P1;        TEMPO TOTAL P2 ;         TEMPO TOTAL P3.\n" );
        System.out.printf( TT1+"ms"+"                             "+TT2+"ms" +"                 "+TT3+"ms");
        System.out.println("\nCHAVEAMENTO P1;        CHAVEAMENTO P2;          CHAVEAMENTO P3.");
        System.out.println((TT1 -p1)+"ms" +"                             "+ (TT2 -p2)+"ms"+ "                 "+ (TT3 - p3)+"ms");

    }
    // Esse paragrafo foi editado

}
