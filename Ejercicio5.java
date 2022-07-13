import java.util.Scanner;

/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio5
{
     public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa primer numero: ");
        int x = input.nextInt();
        System.out.println("Ingresa segundo numero: ");
        int y = input.nextInt();
        System.out.println("Ingresa tercer numero: ");
        int z = input.nextInt();
        int result= (x*y*z);
        System.out.printf("%s%d","Product is ", result);
           
    }
   
 
  
   

   
   
}
