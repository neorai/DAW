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
public class Incognita {
    public static void main(String[] args) {
        float numUno,numDos,numDosIzq;
        float x;
        Scanner teclado = new Scanner( System.in );
        System.out.print( "Introducir primer número: " );
        numUno = teclado.nextInt(); // pedimos el primer número al usuario
        System.out.print( "Introducir segundo número: " );
        numDos = teclado.nextInt(); // pedimos el primer número al usuario
        
        numDosIzq = -(numDos); // al pasar el numero a la izquierda se pasa como negativo (- +)= -   o   (- -)= +
        
        
        x = numDosIzq / numUno;
        
        System.err.println("El valor de x es: " +  x);
    } //fin void
}   //fin class incognita
