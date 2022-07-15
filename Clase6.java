import java.util.Scanner;

/**
 * Write a description of class 
 *              Ejercicio2 de la pagina 283
 *              Ejercicio 8. 2.14  de la pagina 285
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase6
{
    public static void main (String args[]){
        System.out.print("Enter an integer: ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        System.out.print("Enter an integer: ");
        int c = sc1.nextInt();
        int a=b*c;
        System.out.println(a);  
        //Ejercicio 8.-- 2.14    
        System.out.println("1 2 3 4");
        System.out.print("1");
        System.out.print(" 2");
        System.out.print(" 3");
        System.out.print(" 4");
        System.out.println();
        System.out.printf("%d %d %d %d", 1, 2, 3, 4 );       
    }
}