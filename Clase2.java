import java.util.Scanner;

/**
 * Write a description of class Clase2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clase2
{
   public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int valorEntrada = input.nextInt();
        System.out.println("El numero es: "+valorEntrada);
        int c = 1+1;
        System.out.println(5 + ( (c + 1 + 1) / 10 )  *  5);
        System.out.println(5 + c + 1 + 1 / 10  *  5);
          }
   
   public void Multi(){
       
       System.out.println("Ingresa primer numero: ");
       Scanner sc1 = new Scanner(System.in);
       int num1 = sc1.nextInt();
       System.out.println("Ingresa segundo numero: ");
       Scanner sc2 = new Scanner(System.in);
       int num2 = sc2.nextInt();
       int res=num1*num2;
       System.out.println("El resultado es: "+ res );
     }
   
   public void OperacionBeto(){
       //TODO
   }

}
