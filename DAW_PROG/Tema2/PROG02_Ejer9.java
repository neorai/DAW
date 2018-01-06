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
public class SepararNumero {
    public static void main(String[] args) {
        int x,longitud;
        String xString,numeroSplit = "",almcenaNum = "";
        
        Scanner teclado = new Scanner( System.in );
        System.out.print( "Introducir el número: " );
        x = teclado.nextInt(); // pedimos el primer número al usuario
        
        xString = Integer.toString(x); // trasforma int to string
        longitud = xString.length(); // devuelve un int
        String longCorrecta = (longitud == 5)?"Logitud correcta":"el numero no tiene 5 digitos";
        System.out.println(longCorrecta);
        
        char[] numero; //inicializar array
        numero = xString.toCharArray(); // cada caracter del string se convierte en una posicion en el array
        
        for(int i = 0; i < numero.length; i++) // recorre todas las posiciones del array
           numeroSplit += numero[i] + " "; // va alamcenando las posiciones con el espacion en un variable
        System.out.println(numeroSplit);
        
    }//fin void
}//fin class separarnumero
