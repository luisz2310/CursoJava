import java.util.Scanner;
/**
 * Write a description of class Ejercicio7 here.
 *  9. 2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user and prints their sum, product,
 *  difference and quotient (division).
 *  10. 2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains them from the user and displays the larger number
 *  followed by the words "is larger". If the numbers are equal, print the message "These numbers are equal".
 *
 *@author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio7v1
{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese primer numero:");  
    int num1= sc.nextInt();
    System.out.println("Ingrese segundo numero: ");
    int num2= sc.nextInt();  
    int sum= num1+num2;
    System.out.println("El resultado de la Suma es: "+ sum);
    int mult= num1*num2;
    System.out.println("El resultado de la Multiplicacion es: "+ mult);
    float div = (float) num1/num2;
    System.out.println("El resultadod de la Division es: "+ div);
    //Ejercicio 2.16
    if(num1==num2){
        System.out.println("Los numeros son iguales!! ");
    } else if(num1>num2){
        System.out.println(num1+" es mayor que "+ num2);
    }else{
        System.out.println(num2+" es mayor que "+ num1);
    }
   }
}