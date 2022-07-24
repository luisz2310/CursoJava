import java.util.Scanner;

/**
 * Write a description of class Interes_Comp_Clase11 here.
 * 
 * @author (jessica) 
 * @version (22/07/2022)
 */
public class Interes_Comp_Clase11
{
    public static void main (String args[]){
        Scanner s = new Scanner (System.in);
        float x1,x2,xf;
        int u=12;  
        float interes;
        float conv1, potencia;
        potencia=1;
        System.out.println("Introduzca su monto a ahorrar");
        float C = s.nextFloat();
        System.out.println("Introduzca su % de ganancia mensual:");
        float t = s.nextFloat();
        System.out.println("Introduzca el tiempo(año) que guardara su dinero:");
        int n= s.nextInt();
        // x = C (1+t/n)nu - C
        interes=t/100;
        conv1=u * n;
        //x1=1+interes/n;
            while(0<conv1){
                 potencia = (1+interes/n)* potencia ;
                 conv1--;
               // esta acción ase que al valor del exponente se le reste 1
            }
         x2= C*(potencia);
         xf=x2-C;
        System.out.println("Su capital es de: "+x2);
    }
}
