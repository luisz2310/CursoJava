import java.util.Scanner;

/**
 * Write a description of class IMCjessica here.
 * 
 * @author (jessica) 
 * @version (21/07/2022)
 */
public class IMC_10_jessica
{
    public static void main (String args[]){
        Scanner s = new Scanner (System.in);
        System.out.println("Introduzca su peso en kilogramos:");
        float kilo = s.nextFloat();
        System.out.println("Introduzca su altura en metros:");
        float metro = s.nextFloat();
        //se calcula dividiendo los kilogramos de peso por el cuadrado de la estatura en metros
        //IMC = peso [kg]/ estatura [m2]
        float IMC=kilo/(metro*metro);
        System.out.println("Tu masa corporal es:"+IMC);
        if(IMC<18.5f){
            System.out.println("Tu peso es insuficiente");
        }
         if(IMC>18.5f && IMC<24.9f ){
            System.out.println("Tu peso es saludable");
         }
          if(IMC>25.0f && IMC<29.9f ){
            System.out.println("Tienes sobrepeso");
          }
           if(IMC>30.0f){
            System.out.println("Tienes obesidad");
           }
    }
}  
