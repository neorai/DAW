/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamarobjeto;
import alumno.Alumno; // primero hay que añadir en propiedas el proyecto anteiro en librerias

/**
 *
 * @author robert
 */
public class LlamarObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno = new Alumno("robert",24,(float) 8.4);
        
        System.out.println("Nombre: " + alumno.consulta_Nombre());
        System.out.println("Edad: " + alumno.consulta_Edad());
        System.out.println("Nota: " + alumno.consulta_Nota());
        
    }


    
}
