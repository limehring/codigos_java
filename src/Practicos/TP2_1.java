/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicos;

import Utilities.TecladoIn;

/**
 *
 * @author Lisandro
 */
public class TP2_1 {
    static void moduloA (){
        char[] vocales={'A','E','I','O','U'};
        for (int i=0;i<vocales.length;i++){
        System.out.println("Vocal "+(i+1)+" = "+vocales[i]);
        }
    }


   public static void moduloB (){
        int[] enteros=new int[1000];
        for (int i=0;i<=enteros.length;i++){
            System.out.println("Núnero "+i);
}
}

   static void moduloC (){
       int[] consecutivos=new int[40000];
       for (int i=10000;i<=(consecutivos.length+10000);i=i+2){
       System.out.println("Número "+i);
   }
   }
   
   
    static void moduloD(){
        char[] abecedario=new char[27];
        for (int i=97;i<123;i++){
        System.out.println((char)i);
        }
    }

static void moduloE (){
    int [] numeros=new int [101];
    int randomNum;
    for (int i=0;i<numeros.length;i++){
    Random valorDado;    
    Random r = new Random();
    int valorDado=r.nextInt(6)+1;
        
    }
}

public static void main (String[] args){
    int opcion;
    System.out.println("Ingrese una opcion: 1-moduloA 2-moduloB 3-moduloC 4-moduloD 5-moduloE 6-moduloF 7-moduloG 8-moduloH");
    opcion=TecladoIn.readLineInt();
    switch(opcion){
        case 1:moduloA();break;
        case 2:moduloB();break;
        case 3:moduloC();break;
        case 4:moduloD();break;
        case 5:moduloE();break;
        case 6:moduloF();break;
        case 7:moduloG();break;
        case 8:moduloH();break;
    }
 moduloD();   
}













}
