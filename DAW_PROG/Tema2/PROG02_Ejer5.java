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
public class Multiplo {
    
    public static void main(String[] args) {
        
        int numUno,numDos;
        String resultado;
        Scanner teclado = new Scanner( System.in );
        System.out.print( "Introducir primer número: " );
        numUno = teclado.nextInt(); // pedimos el primer número al usuario
        System.out.print( "Introducir segundo número: " );
        numDos = teclado.nextInt(); // pedimos el primer número al usuario
        
        resultado=((numUno % numDos) == 0)? "multiplo":"no es multiplo";
        
        System.out.printf("%s es %s de %s",numUno,resultado,numDos);
    } //fin void
    
} //fin class multiplo
