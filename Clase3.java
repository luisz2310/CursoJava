import java.util.Scanner;

/**
 * Write a description of class Clase3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clase3
{
   public static void main(String arg[]){
       Clase3 c = new Clase3();
       c.sam();
       c.jess();
   }
   
   /*LEER 2 NUMEROS Y DECIR LAS COMBINACIONES
    ==
    !=
    >
    <
    >=
    <=
    restriccion usar printf
   */
   public void sam(){  
   }
   
   public void jess(){
       int n1, n2, suma;
       System.out.printf("Ingresa primer numero: ");
       Scanner sc1 = new Scanner(System.in);
       n1 = sc1.nextInt();
       System.out.printf("Ingresa segundo numero: ");
       Scanner sc2 = new Scanner(System.in);
       n2 = sc2.nextInt();
       if(n1==n2){
       System.out.printf("%d == %d%n",n1, n2 );
        }
       if(n1!=n2){
       System.out.printf("%d != %d%n",n1, n2 );
        }
        if(n1>n2){
       System.out.printf("%d > %d%n",n1, n2 );
        }
        if(n1<n2){
       System.out.printf("%d > %d%n",n1, n2 );
        }
        if(n1<=n2){
       System.out.printf("%d <= %d%n",n1, n2 );
        }
        if(n1>=n2){
       System.out.printf("%d >= %d%n",n1, n2 );
        } //se cierra el if
   }//se cierra jess
}//se cierra el main
