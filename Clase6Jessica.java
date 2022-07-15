import java.util.Scanner;

/**
 * Write a description of class Clase6Jessica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase6Jessica
{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = input.nextInt();
        System.out.print("Enter an integer ");
        int y = input.nextInt();
        int result= (x*y);
        System.out.printf("%s%d","Product is ", result);
        
        System.out.println("1 2 3 4");
        
        System.out.printf("%d %d %d %d%n",1, 2, 3, 4);
        
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4");
    } 
}
