import java.util.Scanner;

/**
 * Write a description of class Ejercicio11Sam1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio11Sam1
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa altura en mts: ");
        float alt= sc.nextFloat();
        System.out.println("Ingresa peso en Kg: ");
        float peso= sc.nextFloat();
        float BMI=peso/(alt*alt);
        System.out.println("Tu BMI es de: "+ BMI);
        if(BMI<18.5f){
        System.out.println("Bajo peso ");
        }
        if(BMI>18.5f && BMI<24.9f){
        System.out.println("Peso Normal");
        }if(BMI>25f && BMI<29.9f ){
        System.out.println("Sobrepeso ");
        }
        if(BMI>30f){
            System.out.println("Obesidad ");
        }
     }
}
