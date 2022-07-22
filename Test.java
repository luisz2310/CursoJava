import java.util.Scanner;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
   public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        int num1= sc.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int num2= sc.nextInt();
        System.out.println("Ingrese terce numero: ");
        int num3= sc.nextInt();
        int prom= (num1+num2+num3)/3;
        System.out.println("El promedio es: "+prom);
        int mult=num1*num2*num3;
        System.out.println ("El resultado de la multiplicacion es: "+mult);
        if(num1>num2 && num1>num3){
        System.out.println("El numero mayor es: "+ num1);
        }else if(num2>num1 && num2>num3){
        System.out.println("El numero mayor es: " + num2);
          }else if(num3>num1 && num3>num2){
              System.out.println("El numero mayor es: "+ num3);
            }
        if(num1<num2 && num1<num3){
        System.out.println("El numero menor es: "+ num1);
        }else if(num2<num1 && num2<num3){
        System.out.println("El numero mayor es: " + num2);
          }else if(num3<num1 && num3<num2){
              System.out.println("El numero mayor es: "+ num3);
            }
    }
}
