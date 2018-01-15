/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SentenciasAlternativas;

import java.util.Scanner;

/**
 *
 * @author robert
 */
public class SenAlternativas {
    //ejer 1
    int numUno,absoluto;
    //ejer 2
    int numDos;
    String par;
    //ejer 3
    int mayor,mayorTemp;
    //ejer 4
    int mayorMenor[] = {0,0,0};
    boolean econtradoMayor = false;
    //ejer 5
    int intervalo[] = {0,0,0};
    
    public SenAlternativas(){
    
    }
    //=================
    // Ejercicio 1   ==
    //=================
    //Trasforma un numero negativo en absoluto
    public int valorAbsoluto(int numUno){
        this.numUno = numUno;
        if (this.numUno < 0) {
            absoluto = this.numUno - (this.numUno * 2);
        }else{
            absoluto = this.numUno;
        }
        return absoluto;
    }
    //=================
    // Ejercicio 2   ==
    //=================
    //Comprueba si el numero es par
    public String par(int numDos){
        this.numDos = numDos;
        if ((this.numDos % 2) == 0) {
            par = "El numero "+this.numDos+" es par";
        }else{
            par = "";
        }
        return par;
    }
    //=================
    // Ejercicio 3   ==
    //=================
    //Saca el mayor de tres numeros
    public int mayor(int mayor){
        if(mayor > this.mayorTemp){
            this.mayor = mayor;
            this.mayorTemp = this.mayor;
        }
        return this.mayor;
    }

    //=================
    // Ejercicio 4   ==
    //=================
    //Saca el mayor y menor de tres numeros, posicion 0 mayor posicion 2 menor
    //primero completamos el array con todos los numeros y luego con otro metodo 
    //hacemos la comprovación
    
    //primero vamos almacenado los datos en el array
    public void setArrayMayorMenor(int mayor, int posicion){
        this.mayorMenor[posicion] = mayor;
    }
    //algoritmo burbuja para ordenar el array
    public void ordenaArray(){
        int numFaltantes = 2; //logitud del array
        for (int j = 0; j < numFaltantes; j++) {
            for (int i = 0; i < numFaltantes-j; i++) {
                if(this.mayorMenor[i] > this.mayorMenor[i+1]){
                    //obligatorio hacer asi la asignacion, hay que tener en cuenta que si se asiga sin depender de "a" se 
                    //sobrescribe this.mayorMenor[i] en el segundo paso
                    int a = this.mayorMenor[i+1];
                    this.mayorMenor[i+1] = this.mayorMenor[i];
                    this.mayorMenor[i] = a;
                }   
            }
        }
    }
    //para poder solicitar una posicion del array
    public int getArrayMenorMayor(int posicion){
        return this.mayorMenor[posicion];
    }
    //=================
    // Ejercicio 5   ==
    //=================
    //scar si el numero esta en el intervalo
    public String intervalo(int numUno,int numDos,int numTres){
        int mayorIntervalo;
        int menorIntervalo;
        if (numUno > numDos){
            mayorIntervalo = numUno;
            menorIntervalo = numDos; 
        }else{
            mayorIntervalo = numDos;
            menorIntervalo = numUno; 
        }
        if (numTres <= mayorIntervalo && numTres >= menorIntervalo) {
            return "El número "+ numTres +" pertenece al intervalo ["+ mayorIntervalo +","+ menorIntervalo +"]";
        } else {
            return "El número "+ numTres +" no pertenece al intervalo ["+ mayorIntervalo +","+ menorIntervalo +"]";
        }
    }
    
    //=================
    // INICIO MAIN   ==
    //=================
    public static void main(String[] args) {
        int numTeclado;
        int numTecladoArray[] = {0,0,0};
        SenAlternativas operacionesAlternativas = new SenAlternativas();
        Scanner teclado = new Scanner (System.in);
        
        //=================
        // Ejercicio 1   ==
        //=================
        System.out.println("Por favor, intruzca un número: ");
        //comprueba que se introduzca un numero entero
        if(teclado.hasNextInt()){
            numTeclado = teclado.nextInt();
            System.out.println("Su valor absoluto es "+operacionesAlternativas.valorAbsoluto(numTeclado));
        }else{
            System.out.println("No ha introducido un numero entero");
        }
        //=================
        // Ejercicio 2   ==
        //=================
        System.out.println("Por favor, intruzca un número: ");
        //comprueba que se introduzca un numero entero
        if(teclado.hasNextInt()){
            numTeclado = teclado.nextInt();
            System.out.println(operacionesAlternativas.par(numTeclado));
        }else{
            System.out.println("No ha introducido un numero entero");
        }
        //=================
        // Ejercicio 3   ==
        //=================
        System.out.println("Por favor, intruzca tres números: ");
        //comprueba que se introduzca un numero entero
        if(teclado.hasNextInt()){
            for (int i = 0; i < 3; i++) {
                numTeclado = teclado.nextInt();
                operacionesAlternativas.mayor(numTeclado);
            }
            System.out.println("El número mayor es el " + operacionesAlternativas.mayor);
        }else{
            System.out.println("No ha introducido un numero entero");
        }
        
        //=================
        // Ejercicio 4   ==
        //=================
        System.out.println("Por favor, intruzca tres números: ");
        //comprueba que se introduzca un numero entero
        if(teclado.hasNextInt()){
            for (int i = 0; i < 3; i++) {
                numTeclado = teclado.nextInt();
                operacionesAlternativas.setArrayMayorMenor(numTeclado,i);
            }
            operacionesAlternativas.ordenaArray();
            System.out.println("El número mayor es el " + operacionesAlternativas.getArrayMenorMayor(2) + " y el menor es " + operacionesAlternativas.getArrayMenorMayor(0));
        }else{
            System.out.println("No ha introducido un numero entero");
        }
        //=================
        // Ejercicio 5   ==
        //=================
        System.out.println("Por favor, escribe dos números para establecer el intervalo: ");
        //comprueba que se introduzca un numero entero
        if(teclado.hasNextInt()){
            for (int i = 0; i < 2; i++) {
               numTeclado = teclado.nextInt();
               numTecladoArray[i] = numTeclado; 
            }
            
            System.out.println("Por favor, escribe otro número: ");
            numTeclado = teclado.nextInt();
            numTecladoArray[2] = numTeclado;
            
            System.out.println(operacionesAlternativas.intervalo(numTecladoArray[0],numTecladoArray[1],numTecladoArray[2]));
            
        }else{
            System.out.println("No ha introducido un numero entero");
        }
    }
}
