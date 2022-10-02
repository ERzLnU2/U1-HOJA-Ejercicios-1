/** 

1. Pedir al usuario su edad y mostrar la que tendrá el próximo año.
   @author Daw120
 
 */
package com.solomongo.ejercicio1_daw120; 
import java.util.Scanner;
public class Ejercicio1_DAW120 {            
    public static void main(String[] args) { 
      
      Scanner teclado = new Scanner(System.in);    // del teclado entra un String..
      int edadHoy; 
      int edad; 
      System.out.print("\nEdad actual: "); 
      edadHoy=teclado.nextInt();                   // del teclado se pasa a int!! par sacar el valor de la var
      
      // YA SE PUEDE OPERAR, no es cadena de texto, son numeros:
      edad=(edadHoy+1); 
      System.out.print("Edad dentro de un ano: "+edad+"\n\n"); 
    }
}
