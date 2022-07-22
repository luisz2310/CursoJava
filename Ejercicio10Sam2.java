import java.util.Scanner;
/**
 * Write a description of class Ejercicio10Sam2 here.
 * 26. 2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and prints the number of negative numbers
 * input, the number of positive numbers input and the number of zeros input.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio10Sam2
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese tercer numero: ");
        int num3 = sc.nextInt();
        System.out.println("Ingrese cuarto numero: ");
        int num4 = sc.nextInt();
        System.out.println("Ingrese quinto numero: ");
        int num5 = sc.nextInt();
        int post=0, neg=0, ceros=0;
        if(num1>0){
            post=post+1;
        }
        if(num2>0){
             post=post+1;
        }
        if(num3>0){
             post=post+1;
        }
        if(num4>0){
             post=post+1;
        }
        if(num5>0){
             post=post+1;
        }
        System.out.println("");
        System.out.println("Hay "+post+ " Numeros Positivos" );
        if(num1==0){
        ceros=ceros+1;
        }
        if(num2==0){
        ceros=ceros+1;
        }
        if(num3==0){
        ceros=ceros+1;
        }
        if(num4==0){
        ceros=ceros+1;
        }
        if(num5==0){
        ceros=ceros+1;
        }
        System.out.println("");
        System.out.println("Hay "+ceros+ " Numeros Ceros" );
        if(num1<0){
        neg=neg+1;
        }
         if(num2<0){
        neg=neg+1;
        }
         if(num3<0){
        neg=neg+1;
        }
         if(num4<0){
        neg=neg+1;
        }
         if(num5<0){
        neg=neg+1;
        }
        System.out.println("");
        System.out.println("Hay "+neg+ " Numeros Negativos" );
    }   
}
