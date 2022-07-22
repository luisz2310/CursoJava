import java.util.Scanner;
/**
 * Write a description of class Ejercicio9Samantha here.
 * 18. 2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines and prints the largest and smallest integers in the
 *    group. Use only the programming techniques you learned in this chapter.
 * 19. 2.25 (par o impar) Escriba una aplicación que lea un número entero y determina e imprime si es par o impar. [Sugerencia: use el resto
 *    operador. Un número par es un múltiplo de 2. Cualquier múltiplo de 2 deja un
 *    resto de 0 cuando se divide por 2. 
 * 20. 2.26 (Multiples) Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result. [Hint:
 *    Use the remainder operator.] 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio9Samantha
{
    public static void main(String args[]){
      //Ejercicio 18
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese primer numero: ");
      int num1 = sc.nextInt();
      System.out.println("Ingrese segundo numero: ");
      int num2 = sc.nextInt();
      System.out.println("Ingrese tercer numero: ");
      int num3 = sc.nextInt();
      System.out.println("Ingrese cuarto numero: ");
      int num4 = sc.nextInt();
      System.out.println("Ingrese quinto numero: ");
      int num5 = sc.nextInt();
      if(num1>num2 && num1>num3 && num1>num4 && num1>num5 ){
        System.out.println("El numero mayor es: "+ num1);
        }
      if(num2>num1 && num2>num3 && num2>num4 && num2>num5){
        System.out.println("El numero mayor es: "+ num2);
        }
      if(num3>num1 && num3>num2 && num3>num4 && num3>num5){
        System.out.println("El numero mayor es: "+ num3);
        }
      if(num4>num1 && num4>num2 && num4>num3 && num4>num5){
        System.out.println("El numero mayor es: "+ num4);
      }
      if(num5>num1 && num5>num2 && num5>num3 && num5>num4){
        System.out.println("El numero mayor es: "+num5);
      }
       if(num1<num2 && num1<num3 && num1<num4 && num1<num5){
        System.out.println("El numero menor es: "+num1);
      }
      if(num2<num1 && num2<num3 && num2<num4 && num2<num5){
       System.out.println("El numero menor es: "+ num2);
        }
      if(num3<num1 && num3<num2 && num3<num4 && num3<num4){
        System.out.println("El numero menor es: "+ num3);
        }
      if(num4<num1 && num4<num2 && num4<num3 && num4<num5){
        System.out.println("El numero menor es: "+ num4);
        }
      if(num5<num1 && num5<num2 && num5<num3 && num5<num5){
            System.out.println("El numero menor es" + num5);
        }
      //Ejercicio 19
      System.out.println("*****Determinar si el numero es par o impar*****");
      System.out.println("ingrese numero: ");
      int num = sc.nextInt();
      if(num % 2 == 0){
          System.out.println("El numero es par");
        }else{
          System.out.println("El numero es impar");
        }
      //Ejercicio 20
      System.out.println("*****Determinar si los numeros son Multiplos*****");
      System.out.println("El segundo numero debe ser mayor que el primero");
      System.out.println("Ingrese primero numero");
      int numMult1= sc.nextInt();
      System.out.println("Ingrese segundo numero");
      int numMult2= sc.nextInt();
      if(numMult2 % numMult1 == 0){
      System.out.println("El numero "+numMult1+" es multiplo de "+numMult2);
      }else{
      System.out.println("Los numeros no son multiplos");
      }
   }
}
