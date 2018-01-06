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
public class Operaciones {
    public static void main(String[] args) {
		System.out.println("------- Conversiones entre enteros y coma flotante -------");
        float x = 4.5f;
        float y = 3.0f;
        int i = 2;
        int j = (int) (i * x);
        System.out.println("Producto de int por float: j= i*x = " + j);
        double dx = 2.0D;
        double dz = dx*y;
        System.out.println("Producto de float por double: dz=dx * y = " + dz);
        byte bx = 5;
        byte by = 2;
        byte bz = (byte) (bx - by);
		
		
		
        System.out.println("------- Operaciones con byte -------");
        System.out.println("byte: "+ bx +" - "+ by + " = " + bz);
        bx = -128;
        by = -1;
        bz = (byte) (bx + by);
        System.out.println("byte: "+ bx+" " + by + " = " + bz);
        //no se puede almacenar un int en una variable byte sin que se pierdan valores
        int bzDos = (int) (bx + by);    
        System.out.println("byte:(int) ("+ bx +" "+ by + ") = " + bzDos);
		
		
		
        System.out.println("------- Operaciones con short -------");
        short sx = 5;
        short sy = 2;
        short sz = (short) (sx - sy);
        System.out.println("Short: "+ sx + " - "+ sy +" = " + sz);
        sx = 32767;
        sy = 1;
        sz = (short) (sx + sy);
        System.out.println("Short: "+ sx +" + "+ sy + " = " + sz);
		
		
		
        System.out.println("------- Operaciones con char -------");
        char cx = '\u000F';
        char cy = '\u0001';
        int z = cx - cy;
        System.out.println("Char: "+ cx +" - "+ cy + " = " + z);
        z = cx -1;
        System.out.println("Char:  char(0x000F) - "+ (int) cy + " = " + z);
        cx = '\uFFFF';
        System.out.println("Char:  (int)"+ (int) cx );
        System.out.println("Char:  (short)"+ (short) cx );
        sx = -32768;
        int resultado = (int)(char)(short) (sx);
        System.out.println(sx+ " short-char-int = "+ resultado);
        int resultadoDos =  (int)(char)(short) (-1);
        System.out.println(by+ " short-char-int = "+ resultadoDos);      
            
    }//fin void
}//fin class operaciones
