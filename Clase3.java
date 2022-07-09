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
       Scanner sc1 = new Scanner(System.in);
       System.out.printf("%s%s%s","Ingresa ", " Primer ", "numero: ");
       int num1= sc1.nextInt();
       Scanner sc2 = new Scanner(System.in);
       System.out.printf("%s%s%s","Ingresa ", " Segundo ", "numero: ");
       int num2 = sc2.nextInt();
       if(num1 == num2){
            System.out.printf("%d == %d %n", num1, num2);           
        }
        if(num1 != num2 ){
            System.out.printf("%d != %d %n", num1,num2);
        }
        if(num1 > num2 ){
            System.out.printf("%d > %d %n",  num1,num2 );
        }
        if(num1 < num2 ){
            System.out.printf("%d < %d %n", num1, num2);
        }
        if(num1 >= num2){
            System.out.printf("%d >= %d%n", num1, num2);
        }
        if(num1 <= num2){
            System.out.printf("%d <= %d%n", num1, num2);
        }
   }
   
   public void jess(){
       
   }
}
