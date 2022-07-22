import java.util.Scanner;

/**
 * Write a description of class Clase10_PosNeg here.
 * 
 * @author (jessica) 
 * @version (21/07/2022)
 */
public class Clase10_PosNeg
{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        System.out.println("Introduzca el primer número:");       
        int n1 = s.nextInt();
        System.out.println("Introduzca el segundo número:");
        int n2 = s.nextInt();
        System.out.println("Introduzca el tercer número:");
        int n3 = s.nextInt();
        System.out.println("Introduzca el tercer número:");
        int n4= s.nextInt();
        System.out.println("Introduzca el cuarto número:");
        int n5 = s.nextInt();
        int positivos=0; 
        int negativos=0;
        int ceros=0;
        //comparar si hay positivos
        if(n1>0){
         positivos=positivos+1;
        }
         if(n2>0){
         positivos=positivos+1;
         }
          if(n3>0){
          positivos=positivos+1;
          }
           if(n4>0){
           positivos=positivos+1;
           }
            if(n5>0){
            positivos=positivos+1;
            }
        //comparar si hay negativos
        if(n1<0){
         negativos=negativos+1;
        }
         if(n2<0){
         negativos=negativos+1;
         }
          if(n3<0){
          negativos=negativos+1;
          }
           if(n4<0){
           negativos=negativos+1;
           }
            if(n5<0){
            negativos=negativos+1;
            }
        //si son iguales a cero
        if(n1==0){
         ceros=ceros+1;
        }
         if(n2==0){
         ceros=ceros+1;
         }
          if(n3==0){
          ceros=ceros+1;
          }
           if(n4==0){
           ceros=ceros+1;
           }
            if(n5==0){
            ceros=ceros+1;
            }
        System.out.printf("Total de positivos  %d%n" ,positivos);
        System.out.printf("Total de negativos  %d%n" ,negativos);
        System.out.printf("Total de ceros  %d%n" ,ceros);
    }
}
