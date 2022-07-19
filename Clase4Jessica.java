import java.util.Scanner;

/**
 * 
 * 
 * @author Jessica 
 * @version 11 julio 2022
 */
public class Clase4Jessica
{
  public static void main (String args[]){
      //Declare las variables c, thisIsAVariable, q76354 y number sea de tipo int e inicialice cada uno a 0.
      int c = 0;
      int thisIsAVariable = 0;
      int q76354 =0;
      int number = 0;
      //Pida al usuario que ingrese un número entero.
      //Ingrese un número entero y asigne el resultado al valor de la variable int.
         Scanner input = new Scanner(System.in);
         int value = input.nextInt();
      //Escriba "Este es un programa Java" en una línea en el ventana de comando Utilice el método System.out.println.
         System.out.println("This is a Java program");
      //Escriba "Este es un programa Java" en dos líneas en el ventana de comando La primera línea debe terminar con Java. Usar método System.out.printf y dos especificadores de formato %s.
         System.out.printf("%s%n%s","This is a Java program","This is a Java program");
      if (number != 7){ //Si el numero ingresado es diferente de 7
         System.out.println("The variable number is not equal to 7");
    }
  }
}
