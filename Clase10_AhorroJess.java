import java.util.Scanner;

/**
 * Write a description of class Clase10_AhorroJess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase10_AhorroJess
{
    public static void main (String args[]){
        Scanner s = new Scanner (System.in);
            System.out.println("Introduzca total de kilometros recorridos en un dia");
            float km = s.nextFloat();
            System.out.println("Introduzca el precio del litro de gasolina:");
            float litro = s.nextFloat();
            System.out.println("Introduzca el promedio de kilometros que recorre por litro");
            float kilometro = s.nextFloat();
            System.out.println("Introduzca el costo del estacionamiento por dia:");
            float costo = s.nextFloat();
            System.out.println("Introduzca el tiempo que esta el auto en el estacionamiento");
            float tiempo = s.nextFloat();
            //(Km al dia = 25 km) * (litro de gas = 25 carro consume) / 15km/l
            float resgas=0;
            float resest=0;
            float total=0;
            resgas=(km*litro)/kilometro;
            resest=costo*tiempo;
            total=resgas+resest;
            System.out.println("                          ");
            System.out.println("Gas que gastas : $ "+resgas);
            System.out.println("Estacionamiento: $ "+resest);
            System.out.println("                ------------");
            System.out.println("          Total: $ "+total);
    }
}
