/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SenIterativas;

//import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


/**
 *
 * @author robert
 */
public class SenIterativas {
    //ejer 1
    int pares;
    
    //ejer 2
    
    //ejer 3
    
    //ejer 4
    int[] menorEnSecuencia; // para operar con el
    Integer[] menorEnSecuenciaOrigin; //para guardar las posiciones originales
    int tamanoArray;
    
    //ejer 5
    String esPrimo;
    
    public SenIterativas(){
        
    }
    //=================
    // Ejercicio 1   ==
    //=================
    //de una secuencia de numeros obtener los pares
    public int secuenciaNumeros(String[] numeros){
        int contPares = 0;
        for(String num : numeros){
            if (num == null || "1".equals(num) || "0".equals(num)) {
            } else {
                int numInt = Integer.parseInt(num);
                if(numInt % 2 == 0) {
                    contPares++;
                }
            }
        }
        return contPares;
    }
    
    //=================
    // Ejercicio 2   ==
    //=================
    //de una secuencia de caracteres calculka cuantas a aparecen
    public int secuenciaCracteres(String[] letras){
        int contA = 0;
        for(String letra : letras){
            if (letra == null || ".".equals(letra)) {
            } else {
                if(letra.equalsIgnoreCase("a")) {
                    contA++;
                }
            }
        }
        return contA;
    }
    
    //=================
    // Ejercicio 3   ==
    //=================
    // de una secuencia de numeros cual es par en posicion par
    //la posicion de inicio es 0 y 0 es par
        public int secuenciaNumerosPar(String[] numeros){
        int contPares = 0;
        int posicion = 0;
        for(String num : numeros){
            if (num == null || "1".equals(num) || "0".equals(num)) {
            } else {
                int numInt = Integer.parseInt(num);
                if(numInt % 2 == 0 && posicion % 2 == 0) {
                    contPares++;
                }
            }
            posicion++;
        }
        return contPares;
    }
    
    //=================
    // Ejercicio 4   ==
    //=================
    //primero vamos almacenado los datos en el array
    public void setTamanoArray(int tamano){
        this.tamanoArray = tamano;
        this.menorEnSecuencia = new int[tamano];
        this.menorEnSecuenciaOrigin = new Integer[tamano];
    }
    //rellenamos el array
    public void setArrayMayorMenor(int mayor, int posicion){
        
        this.menorEnSecuencia[posicion] = mayor;
        this.menorEnSecuenciaOrigin[posicion] = mayor;
    }
    //algoritmo burbuja para ordenar el array
    public void ordenaArray(){
        int numFaltantes; //logitud del array
        numFaltantes = this.tamanoArray - 1; //-1 importante para no salirse del index
        for (int j = 0; j < numFaltantes; j++) {
            for (int i = 0; i < numFaltantes-j; i++) {
                if(this.menorEnSecuencia[i] > this.menorEnSecuencia[i+1]){
                    //oblitario hacer asi la asignacion, hay que tener en cuenta que si se asiga sin depender de "a" se 
                    //sobrescribe this.mayorMenor[i] en el segundo paso
                    int a = this.menorEnSecuencia[i+1];
                    this.menorEnSecuencia[i+1] = this.menorEnSecuencia[i];
                    this.menorEnSecuencia[i] = a;
                }   
            }
        }
    }
    //solicitar una posicion del array
    public int getArrayMenorMayor(int posicion){
        return this.menorEnSecuencia[posicion];
    }
    //buscar el menor en la posicion original
    public int getPosicionSecuencia(){
        int posicion;
        posicion = Arrays.asList(this.menorEnSecuenciaOrigin).indexOf(this.menorEnSecuencia[0]);
        return posicion;
    }
    
    
    //=================
    // Ejercicio 5   ==
    //=================
    //sacar el numero primo
    public String primo(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                this.esPrimo = " NO es primo";
                break;
            } else {
                this.esPrimo = " es primo";
            }
        }
        return num + this.esPrimo;
    }
    
    public static void main(String[] args) {
        //ejer 1
        String numTecladoStringEjer1 = "";
        int contSecuencia = 0;
        boolean finSecuencia = false;
        String[] numTecladoArrayEjer1;
        numTecladoArrayEjer1 = new String[100]; //limite de 100 numeros en secuencia
       
        //ejer 2
        String numTecladoStringEjer2;
        String[] numTecladoArrayEjer2;
        
        //ejer 3
        String numTecladoStringEjer3 = "";
        boolean finSecuenciaPar = false;
        int contSecuenciaPar = 0;
        String[] numTecladoArrayEjer3;
        numTecladoArrayEjer3 = new String[100]; //limite de 100 numeros en secuencia
        
        //ejer 4
        int numTecladoFor;
        
        //ejer5
        int numTeclado;
        
        
        SenIterativas operacionesIterativas = new SenIterativas();
        Scanner teclado = new Scanner (System.in);

        //=================
        // Ejercicio 1   ==
        //=================
        //se emplea un array string porque un array in tiene valores por defecto 0
        System.out.println("Introducir una secuencia de terminado por 0: ");
        while(finSecuencia == false){
            try{
                numTecladoStringEjer1 = teclado.next();
            } catch (Exception e) {
                System.out.println("Error "+e.toString());
            }
            numTecladoArrayEjer1[contSecuencia] = numTecladoStringEjer1;
            numTeclado = Integer.parseInt(numTecladoStringEjer1);
            if (numTeclado == 0) {
                finSecuencia = true;
            }
            contSecuencia++;
        }
        System.out.println("Hay " + operacionesIterativas.secuenciaNumeros(numTecladoArrayEjer1) + " números pares ");
        
        //=================
        // Ejercicio 2   ==
        //=================
        System.out.println("Introducir una secuencia de caracteres terminados por '.': ");
        numTecladoStringEjer2 = teclado.next();
         numTecladoArrayEjer2= numTecladoStringEjer2.split("");

        System.out.println("Hay " + operacionesIterativas.secuenciaCracteres(numTecladoArrayEjer2) + " letras a");
        
        //=================
        // Ejercicio 3   ==
        //=================
        System.out.println("Introducir una secuencia terminada por 0: ");
        while(finSecuenciaPar == false){
            try{
                numTecladoStringEjer3 = teclado.next();
            } catch (Exception e) {
                System.out.println("Error "+e.toString());
            }
            numTecladoArrayEjer3[contSecuenciaPar] = numTecladoStringEjer3;
            numTeclado = Integer.parseInt(numTecladoStringEjer3);
            if (numTeclado == 0) {
                finSecuenciaPar = true;
            }
            contSecuenciaPar++;
        }
        System.out.println("Hay " + operacionesIterativas.secuenciaNumerosPar(numTecladoArrayEjer3) + "  números pares en posiciones pares  ");
        
        //=================
        // Ejercicio 4   ==
        //=================
        System.out.println("Introducir un número: ");
        //comprueba que se introduzca un numero entero
        try {
            numTecladoFor = teclado.nextInt();
            operacionesIterativas.setTamanoArray(numTecladoFor);
            System.out.println("Introducir una secuencia de "+ numTecladoFor +" enteros: ");
            for (int i = 0; i < numTecladoFor; i++) {
                numTeclado = teclado.nextInt();
                operacionesIterativas.setArrayMayorMenor(numTeclado,i);
            }
            operacionesIterativas.ordenaArray();
            System.out.println("El mínimo es " + operacionesIterativas.getArrayMenorMayor(0) + " y se encuentra en la posición " + operacionesIterativas.getPosicionSecuencia());
        } catch (Exception e) {
            System.out.println("Error "+e.toString());
        }
        
        //=================
        // Ejercicio 5   ==
        //=================
        System.out.println("Introducir un número: ");
        //comprueba que se introduzca un numero entero
        
        try {
            numTeclado = teclado.nextInt();
            System.out.println(operacionesIterativas.primo(numTeclado));
        } catch (Exception e) {
            System.out.println("Error "+e.toString());
        }
    }
}
