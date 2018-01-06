/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;
import java.util.Scanner;

/**
 *
 * @author robert
 */
public class Complejo {
    private double real;
    private double imag;
    
    public Complejo(){
        
    }
    public Complejo(double real,double imag){
        this.real = real;
        this.imag = imag;
    }
    
    public double consulta_real(){
        return real;
    }
    
    public double consulta_Imag(){
        return imag;
    }
    
    public void cambia_Real(double real){
        this.real = real;
    }
    
    public void cambia_Imag(double imag){
        this.imag = imag;
    }
    @Override
    public String toString(){
        return (int)real+" + "+(int)imag+"i";
    }
    public void sumar(Complejo b){
        this.real = real + b.real;
        this.imag = imag + b.imag;
    }
    
    public static void main(String[] args) {
        double real;
        double imag;
        Complejo complejoA = new Complejo();
        Complejo b = new Complejo(5,3);
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce parte real: ");
        real = teclado.nextDouble();
        complejoA.cambia_Real(real);
        
        System.out.println("Introduce parte imaginaria: ");
        imag = teclado.nextDouble();
        complejoA.cambia_Imag(imag);
        
        System.out.println("toString: "+complejoA.toString());
        
        
        System.out.println("ComplejoA: "+complejoA.toString());
        System.out.println("ComplejoB: "+b.toString());
        complejoA.sumar(b);
        System.out.println("Suma: "+complejoA.toString());
        
    }
}

