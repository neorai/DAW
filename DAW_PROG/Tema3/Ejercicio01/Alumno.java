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
	private String nombre;
	private int edad;
	private float nota;
	//constructor vacio 
	public Alumno(){
		 
	}
	//constructor con argumentos
	public Alumno(String nombre,int edad,float nota){
		 this.nombre = nombre;
		 this.edad = edad;
		 this.nota = nota;
	}
	//get dek nombre
	public String consulta_Nombre(){
		return nombre;
	}
	//set de la variable nombre
	 public void cambia_Nombre(String nombre){
		this.nombre=nombre;
	}
	public static void main(String[] args){ 
		String nombre;
		//instanciar objeto
		Alumno alumnoObjeto = new Alumno();
		// instanciar objeto para introducir caracteres
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un nombre: ");
		nombre = teclado.nextLine();
		
		alumnoObjeto.cambia_Nombre(nombre);
		System.out.println("El nombre es: " + alumnoObjeto.consulta_Nombre());
		
		alumnoObjeto.cambia_Nombre("roberto");
        System.out.println("El nuevo nombre es: " + alumnoObjeto.consulta_Nombre());
	}
} 

