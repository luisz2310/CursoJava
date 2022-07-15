import java.util.Scanner;

/**
 * Programa que calcule el producto de dos enteros 
 * 
 * @author (Jessica) 
 * @version (12/07/22)
 */
public class Clase5Jessica
{
    public static void main (String args[]){
        int result;
        
        //Lea el primer entero del usuario y guárdelo en el int variable x.
        //Cree un Escáner llamado input que lea valores del entrada estándar.
        System.out.println("Introduzca el primer numero:");
        Scanner num1 = new Scanner (System.in);
        int x = num1.nextInt();
        
        System.out.println("Introduzca el segundo numero:");
        Scanner num2 = new Scanner (System.in);
        int y = num2.nextInt();
        
        System.out.println("Introduzca el tercer numero:");
        Scanner num3 = new Scanner (System.in);
        int z = num3.nextInt();
    
        
        result= x*y*z;
        
        System.out.printf("El producto de los numeros es:%d%n", result);
    }
}