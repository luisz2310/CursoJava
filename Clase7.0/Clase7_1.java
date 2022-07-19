import java.util.Scanner;

/**
 * Write a description of class Clase7_1 here.
 * 
 * @author (jessica) 
 * @version (18/07/2022)
 */
public class Clase7_1
{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Ingresa el primer entero ");
       int number1=input.nextInt();
       System.out.print("Ingresa el segundo entero  ");
       int number2=input.nextInt();
       //operaciones
       int sum=number1+number2;
       System.out.printf("La Suma es: %d%n", sum);
       int res=number1-number2;
       System.out.printf("La Diferencia es: %d%n", res);
       int mul=number1*number2;
       System.out.printf("El Producto es: %d%n", mul);
       int div=number1/number2;
       System.out.printf("La Cociente es: %d%n", div);
    }
   public void class7_2(){
    Scanner input = new Scanner(System.in);
       System.out.print("Ingresa el primer entero ");
       int num1=input.nextInt();
       System.out.print("Ingresa el segundo entero ");
       int num2=input.nextInt();
       if (num1 == num2){
       System.out.printf("%d == %d%n", num1, num2);
       }
       if (num1 != num2) {
       System.out.printf("%d != %d%n", num1, num2);
       }
       if (num1 < num2) {
       System.out.printf("%d < %d%n", num1, num2);
       }
       if (num1 > num2) {
       System.out.printf("%d > %d%n", num1, num2);
       }
       if (num1 <= num2) {
       System.out.printf("%d <= %d%n", num1, num2);
       }
       if (num1 >= num2) {
       System.out.printf("%d >= %d%n", num1, num2);
       }
    }
}
