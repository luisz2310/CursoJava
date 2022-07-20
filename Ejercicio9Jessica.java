import java.util.Scanner;

/**
 * Write a description of class Ejercicio9Jessica here.
 * 
 * @author (jessica) 
 * @version (21/07/2022)
 */
public class Ejercicio9Jessica
{
    //EJERCICIO 18
    public static void main (String args[]){
        Scanner n = new Scanner(System.in);
        System.out.println("                                                ");
        System.out.println("******Calcular cual de los 5 enteros es mayor y cual es menor*******");
        System.out.println("Ingrese el primer entero");
        int n1 = n.nextInt();
        System.out.println("Ingrese el segundo entero");
        int n2 = n.nextInt();
        System.out.println("Ingrese el tercer entero");
        int n3 = n.nextInt();
        System.out.println("Ingrese el cuarto entero");
        int n4 = n.nextInt();
        System.out.println("Ingrese el quinto entero");
        int n5 = n.nextInt();
        //............ n1 .................
        if(n1>n2 && n1>n3 && n1>n4 && n1>n5){
         System.out.printf("El mayor es: %d%n", n1);
        }
        if(n1<n2 && n1<n3 && n1<n3 && n1<n4 && n1<n5){
         System.out.printf("El menor es: %d%n", n1);
        }
        //............ n2 .................
            if(n2>n1 && n2>n3 && n2>n4 && n2>n5){
             System.out.printf("El mayor es: %d%n", n2);
            }
            if(n2<n1 && n2<n3 && n2<n4 && n1<n5){
            System.out.printf("El menor es: %d%n", n2);
            }
        //............ n3 .................
                if(n3>n1 && n3>n2 && n3>n4 && n3>n5){
                 System.out.printf("El mayor es: %d%n", n3);
                }
                if(n3<n1 && n3<n2 && n3<n4 && n3<n5){
                 System.out.printf("El menor es: %d%n", n3);
                }
        //............ n4 .................
                    if(n4>n1 && n4>n2 && n4>n3 && n4>n5){
                     System.out.printf("El mayor es: %d%n", n4);
                    }
                    if(n4<n1 && n4<n2 && n4<n3 && n4<n5){
                     System.out.printf("El menor es: %d%n", n4);
                    }
        //............ n5 .................
                    if(n5>n1 && n5>n2 && n5>n3 && n5>n4){
                     System.out.printf("El mayor es: %d%n", n5);
                    }
                    if(n5<n1 && n5<n2 && n5<n3 && n5<n4){
                     System.out.printf("El menor es: %d%n", n5);
                    }
        //EJERCICIO 19
        System.out.println("                                                ");
        System.out.println("******Calcular si un número es par o impar*******");
        System.out.println("Ingrese el número a calcular");
        int numero = n.nextInt();
            if (numero % 2 ==0){
                System.out.printf("Es un número par");
            }else{
                System.out.printf("Es un número impar");
            }
        //EJERCICIO 20
        System.out.println("                                                ");
        System.out.println("                                                ");
        System.out.println("******Calcular el Múltiplo*******");
        System.out.println("Ingrese el primer número");
        int multiplo1 = n.nextInt();
        System.out.println("Ingrese el segundo número");
        int multiplo2 = n.nextInt();
        if (multiplo1 % multiplo2 ==0){
                System.out.printf("El primer número es múltiplo del segundo");
            }else{
                System.out.printf("El primer número NO es múltiplo del segundo");
            }
    }
}
