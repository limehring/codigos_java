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
public class TP1_5 {
    
    public static String conjuntoValido1 (String conjunto){
        String validez="";
        int i,elemento,j;
        boolean valido=true;
        for (i=0;i<conjunto.length();i++){
            elemento=conjunto.charAt(i);
            for (j=i+1;j<conjunto.length();j++){
                if(elemento==conjunto.charAt(j)){
                    valido=false;
                }
            }
        }
        if (valido==true){
            return validez="es válido";
        }
        else return validez="no es válido";
    }
        
    public static String elementos2 (String conjunto){
        String devuelve="";
        int i;
        for (i=0;i<conjunto.length();i++){
            if (i>0){
            devuelve=devuelve+","+conjunto.charAt(i);
            }
            else devuelve=devuelve+conjunto.charAt(i);
        }
        return devuelve;
    }
    
    
    public static String unionConjuntos (String conjunto1 ,String conjunto2){
        String preunion=conjunto1+conjunto2,union="";
        for (int i=0;i<preunion.length();i++){
            int j=0;
            boolean repite=false;
            while (j<preunion.length()){
               // repite 
            }
        }
        return preunion;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main (String[] args){
        String conjunto1,conjunto2;
        int cardinalidad,opcion;
        System.out.println("||||||||||||||||||||||| Menú ||||||||||||||||||||||");
        System.out.println("|| 1-Verificar si los conjuntos son válidos o no ||");
        System.out.println("|| 2-Mostrar los elementos que lo componen       ||");
        System.out.println("|| 3-Realizar unión de conjuntos                 ||");
        System.out.println("|| 4-Realizar diferencia de conjuntos            ||");
        System.out.println("|| 5-Realizar intersección de conjuntos          ||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Ingrese la cardinalidad de los conjuntos");
        cardinalidad=TecladoIn.readLineInt();
        System.out.println("Ingrese el primer conjunto");
        conjunto1=TecladoIn.readLine();
        System.out.println("Ingrese el segundo conjunto");
        conjunto2=TecladoIn.readLine();
        if (cardinalidad==conjunto1.length()&&cardinalidad==conjunto2.length()){
        System.out.println("Ingrese la opción que desee");
        opcion=TecladoIn.readLineInt();
        switch(opcion){
            case 1:System.out.println("El primer conjunto: "+conjunto1+" "+conjuntoValido1(conjunto1));
                System.out.println("El segundo conjunto: "+conjunto2+" "+conjuntoValido1(conjunto2));
                break;
            case 2:System.out.println("Los elementos del primer conjunto: "+conjunto1+" son: "+elementos2(conjunto1));
            System.out.println("Los elementos del segundo conjunto: "+conjunto2+" son: "+elementos2(conjunto2));break;
            case 3:System.out.println("");break;
            case 4:System.out.println("");break;
            case 5:System.out.println("");break;
        
        }
        }
        else System.out.println("Los conjuntos no poseen la misma cardinalidad");
        }
        
    }

