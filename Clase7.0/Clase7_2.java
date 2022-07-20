import java.util.Scanner;

/**
 * Write a description of class Clase7_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase7_2
{
    public static void main(String[] args){
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
                    System.out.printf("El mayor: %d%n", n3);
                    System.out.printf("El menor: %d%n", n2);
                }else{
                    System.out.printf("El mayor: %d%n", n1);
                    System.out.printf("El menor: %d%n", n2);
                }
            }
        } else{
               if (n1 > n3){
                   //6  3
                System.out.printf("El mayor: %d%n", n2);
                System.out.printf("El menor: %d%n", n3);
              }else{
                    if(n2 < n3){
                    System.out.printf("El mayor: %d%n", n3);
                    System.out.printf("El menor: %d%n", n1);
                    }else{
                        System.out.printf("El mayor: %d%n", n2);
                        System.out.printf("El menor: %d%n", n1);
                    }
               }
       }
    }
}
