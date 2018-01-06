/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.util.Scanner;

/**
 *
 * @author robert
 */


public class Alumno{
    private String nombre = "María Lopez";
    private int edad = 26;
    private float nota = (float) 8.7;
     
    public Alumno(){
         
    }
     
    public Alumno(String nombre,int edad,float nota){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String consulta_Nombre(){
        return nombre;
    }
    public int consulta_Edad(){
        return edad;
    }
    public float consulta_Nota(){
        return nota;
    }
    public void cambia_Nombre(String nombre){
        this.nombre=nombre;
    }
    public void cambia_Edad(int edad){
        this.edad=edad;
    }
    public void cambia_Nota(float nota){
        this.nota=nota;
    }
    public static void main(String[] args){
        String nombre;
        int edad;
        float nota;
        Alumno alumnoObjeto = new Alumno();
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce un nombre: ");
        nombre = teclado.nextLine();
        alumnoObjeto.cambia_Nombre(nombre);
        System.out.println("El nombre es: " + alumnoObjeto.consulta_Nombre());
        alumnoObjeto.cambia_Nombre("roberto");
        System.out.println("El nuevo nombre es: " + alumnoObjeto.consulta_Nombre());
        
        System.out.println("Introduce edad: ");
        edad = teclado.nextInt();
        alumnoObjeto.cambia_Edad(edad);
        System.out.println("El edad es: " + alumnoObjeto.consulta_Edad());
        
        System.out.println("Introduce un nota: ");
        nota = teclado.nextFloat();
        alumnoObjeto.cambia_Nota(nota);
        System.out.println("El nota es: " + alumnoObjeto.consulta_Nota());
    }
}

