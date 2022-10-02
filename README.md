# U1-Hoja-Ejercicios-1
Sumatorio con Java para sacar edad de user y edad pasado un año.

![1](https://user-images.githubusercontent.com/80227002/193454509-52e44cc4-76f1-4b7e-beb1-a477688a6cce.png)


```java
/** pag 16:

1. Pedir al usuario su edad y mostrar la que tendrá el próximo año.

 */
import java.util.Scanner;
public class Ejercicio1_DAW120 {            
    public static void main(String[] args) { 
      Scanner teclado = new Scanner(System.in);
      int edadHoy; 
      int edad; 
      System.out.print("\nEdad actual: "); 
      edadHoy=teclado.nextInt(); 
      edad=(edadHoy+1); 
      System.out.print("Edad dentro de un ano: "+edad+"\n\n"); 
    }
}

```
