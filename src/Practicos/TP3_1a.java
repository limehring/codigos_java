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
public class TP3_1a {

    public static void main(String[] args) {
        int n, m, opcion = 0;
        int[][] matriz = new int[0][0];
        while (opcion != 11) {
            System.out.println("____________________________Menú___________________________________");
            System.out.println("|||||||||0. Ingrese su matriz||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||1. Mostrar los elementos de una matriz.|||||||||||||||||||");
            System.out.println("|||||||||2. Verificar si una matriz es cuadrada. ||||||||||||||||||");
            System.out.println("|||||||||3. Verificar si una matriz es Triangular Superior|||||||||");
            System.out.println("|||||||||4. Verificar si una matriz es Matriz Diagonal ||||||||||||");
            System.out.println("|||||||||5. Suma de matrices|||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||6. Producto por un escalar||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||7. Transponer una matriz||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||8. Sumar los elementos de una fila determinada||||||||||||");
            System.out.println("|||||||||9. Sumar los elementos de una columna|||||||||||||||||||||");
            System.out.println("|||||||||10. Multiplicación de matrices||||||||||||||||||||||||||||");
            System.out.println("|||||||||11. Salir del programa||||||||||||||||||||||||||||||||||||");
            System.out.println("___________________________________________________________________");
            System.out.println("");
            System.out.println("");
            System.out.println("Ingrese una opción");
            opcion = TecladoIn.readLineInt();
            switch (opcion) {
                case 0:
                    int f,
                     c;
                    System.out.println("Ingrese la cantidad de filas");
                    f = TecladoIn.readLineInt();
                    System.out.println("Ingrese la cantidad de columnas");
                    c = TecladoIn.readLineInt();
                    matriz = new int[f][c];
                    elementos(matriz);
                    break;
                case 1:
                    mostrarelementos(matriz);
                    break;
                case 2:
                    System.out.println(verificarCuadrada(matriz));
                    break;
                case 3:
                    System.out.println(triangularSuperior(matriz));
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Opción no válida!");
            }
        }
        System.out.println("Usted salió del programa");
    }

    public static void elementos(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese el valor del elemento (" + i + "," + j + ")");
                matriz[i][j] = TecladoIn.readLineInt();
            }
        }
    }

    public static void mostrarelementos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static String verificarCuadrada(int[][] matriz) {
        String cuadrada = "";
        if (matriz.length == matriz[0].length) {
            return cuadrada = "La matriz ES cuadrada";
        } else {
            return cuadrada = "La matriz NO es cuadrada";
        }
    }

    public static String triangularSuperior(int[][] matriz) {
        int i = 0, j = 0;
        boolean parar = false;
        String triangular = "";
        while (i < matriz.length && parar == false) {
            while (j < matriz[0].length) {
                if (i > j && matriz[i][j] != 0) {
                    parar = true;
                }
                j++;
            }
            i++;
        }
        if (parar == false) {
            return triangular = "La matriz ES triangular superior";
        } else {
            return triangular = "La matriz NO es triangular superior";
        }
    }

}
