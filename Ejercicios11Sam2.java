import java.util.Scanner;
/**
 * Write a description of class Ejercicios11Sam2 here.
 * 2.35 (Car-Pool Savings Calculator) Research several car-pooling websites. Create an application that calculates your daily driving cost, so
 * that you can estimate how much money could be saved by car pooling, which also has other advantages such as reducing carbon emissions and
 * reducing traffic congestion. The application should input the following information and display the user’s cost per day of driving to work:
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicios11Sam2
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor de ingresa el total de kilometros por dia: ");
        float kmDia= sc.nextFloat();
        System.out.println("Favor de ingresar el costo de gasolina por litro: ");
        float gasLt= sc.nextFloat();
        System.out.println("Favor de ingresar el promedio de kilometros por litro: ");
        float kmLt= sc.nextFloat();
        System.out.println("Favor de ingresar Tarifa de estacionamiento por dia: ");
        float TarEst= sc.nextFloat();
        System.out.println("Favor de ingresar Tiempo: ");
        float tiempo= sc.nextFloat();
        float tiemEst=TarEst*tiempo;
        System.out.println("Estacionamiento: $"+tiemEst);
        float gastoGas = ((kmDia/kmLt)*gasLt);
        System.out.printf("Gasto de Gasolina: $ %.2f%n", gastoGas);
        System.out.printf("            Total: $ %.2f%n", (tiemEst+ gastoGas));
    }
}
