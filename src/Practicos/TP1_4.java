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
public class TP1_4 {
    
    public static double binarioAdecimal (String binario){
        int i;
        double decimal=0;
        for (i=0;i<binario.length();i++){
            if ((binario.charAt((binario.length())-(i+1)))=='1'){
                decimal=decimal+Math.pow(2, i);
                System.out.println("if i=="+i);
            }
        }
        return decimal;
    }
    
    
    public static String complementoAuno (String binario){
        String complemento="";
        int i;
        for (i=0;i<(binario.length());i++){
            if (binario.charAt(i)=='0'){
            complemento=complemento+'1';
                    }
            else {
                complemento=complemento+'0';
            }
        }
        return complemento;
    }
        
    public static String complementoAdos (String binario){
        String complemento="";
        int i;
        for (i=0;i<binario.lastIndexOf('1');i++){
            if (binario.charAt(i)=='0'){
            complemento=complemento+'1';
                    }
            else {
                complemento=complemento+'0';
            }
        }
        int x=binario.lastIndexOf('1');
        int z=binario.length();
        complemento=complemento+binario.substring(x,z);
        return complemento;
    }
    
    public static void main(String[] args){
        String numBin;
        int opcion;
        System.out.println("Menú");
        System.out.println("1-Obtener el valor del número binario ingresado en notación decimal");
        System.out.println("2-Obtener el complemento a UNO del número binario.");
        System.out.println("3-Obtener el complemento a DOS del número binario.");
        System.out.println("Ingrese una opción");
        opcion=TecladoIn.readLineInt();
        System.out.println("Ingrese un número binario");
        numBin=TecladoIn.readLine();
        switch(opcion){
            case 1:System.out.println("El valor en decimal es "+binarioAdecimal(numBin));break;
            case 2:System.out.println("El valor en complemento a UNO es "+complementoAuno(numBin));break;
            case 3:System.out.println("El valor en complemento a DOS es "+complementoAdos(numBin));break;
            default :System.out.println("Ésta opción no es válida");break;
        }
        }
    }