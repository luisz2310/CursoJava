import java.util.Scanner;

/**
 * Write a description of class Ejercicios7v2Sam here.
 * 11. 2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user and displays the sum, average, product,
 * smallest and largest of the numbers. Use the techniques shown in Fig. 2.15 [Note: The calculation of the average in this exercise should result in an
 * integer representation of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333….]
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicios7v2Sam
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
