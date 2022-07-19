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
       System.out.printf("%d Estos numeros son iguales  %d%n", num1, num2);
       }
       if (num1 < num2) {
       System.out.printf("%d < %d%n", num1, num2);
       }
       if (num1 > num2) {
       System.out.printf(" Este numero es mayor %d%n", num1);
       }
    }
   public void class7_3(){
       Scanner input = new Scanner(System.in);
       System.out.print("Ingresa el primer entero ");
       int n1=input.nextInt();
       System.out.print("Ingresa el segundo entero  ");
       int n2=input.nextInt();
       System.out.print("Ingresa el tercer entero  ");
       int n3=input.nextInt();
       //operaciones
       int sum=n1+n2+n3;
       System.out.printf("La Suma es: %d%n", sum);
       int mul=n1*n2+n3;
       System.out.printf("El Producto es: %d%n", mul);
       int prom=sum/3;
       System.out.printf("La promedio es: %d%n", prom);
       //n1=1  n2=8  n3=4
       if (n1 > n2) {
            //1 > 8 
            if (n2 > n3) {
                //8 > 4
                System.out.printf("El mayor es: %d%n", n1);  
                System.out.printf("el menor es: %d%n", n3);
            } else {
                if (n1 < n3){
                    System.out.printf("El mayor: %d%n", n2);
                    System.out.printf("El menor: %d%n", n3);
                }else{
                    System.out.printf("El mayor: %d%n", n1);
                    System.out.printf("El menor: %d%n", n2);
                }
            }
        } else{
               if (n1 > n3){
                   //6  3
                System.out.printf("El mayor: %d%n", n3);
                System.out.printf("El menor: %d%n", n1);
              }else{
                    if(n2 < n3){
                    System.out.printf("El mayor: %d%n", n3);
                    System.out.printf("El menor: %d%n", n2);
                    }else{
                        System.out.printf("El mayor: %d%n", n2);
                        System.out.printf("El menor: %d%n", n1);
                     }
                }
              }
    }
}
