/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovariables;

/**
 *
 * @author robert
 */
public class Meses {
    
    public enum Mes {enero,febrero,marzo,abril,junio,julio,agosto,septiembre,octubre,noviembre,diciembre};
    
    public static void main(String[] args) {
        System.out.println(Mes.marzo);
        
        Mes m = Mes.marzo;
        System.out.println(m);
        
    } //fin void
    
} // fin class meses
