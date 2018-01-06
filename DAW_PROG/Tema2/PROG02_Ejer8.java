/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovariables;

import java.util.Scanner;

/**
 *
 * @author robert
 */
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        float x,y;
        
        Scanner teclado = new Scanner( System.in );
        System.out.print( "Introducir primer número: " );
        x = teclado.nextInt(); // pedimos el primer número al usuario
        System.out.print( "Introducir segundo número: " );
        y = teclado.nextInt(); // pedimos el primer número al usuario
        
        System.out.println("El resultado de sumar " + x + " y "+ y + " es " + (x + y));
        System.out.println("El resultado de restart " + x + " y "+ y + " es " + (x - y));
        System.out.println("El resultado de multiplicar " + x + " y "+ y + " es " + (x * y));
        System.out.println("El resultado de dividir " + x + " y "+ y + " es " + (x / y));
        System.out.println("El resultado de " + x + " elevado a "+ y + " es " + Math.pow(x, 2));
        System.out.println("El resultado de la raiz cuadrada de " + x + " es " + Math.sqrt(x));
        
    }//fin void
}//fin class operacionesaricmeticas
