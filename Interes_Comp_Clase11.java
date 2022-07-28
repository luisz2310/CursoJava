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
        double x1=0,x2=0,x3=0,xf,u=12,conv1;
        System.out.println("Introduzca su monto a ahorrar");
        double C = s.nextDouble();
        System.out.println("Introduzca su % de ganancia mensual:");
        float t = s.nextFloat();
        System.out.println("Introduzca el tiempo(año) que guardara su dinero:");
        float n= s.nextFloat();
        //hasta aqui todo ok, muestra el resultado
        x1=(1+(t/100)/12); 
        // conv1=n * u; //hasta aqui todo ok exp.  nu
        conv1=n*u;
        x2=(Math.pow(x1, conv1));
        x3=C*(x2);
        xf=x3-C; 
        System.out.println("Su capital es de: "+xf);
    }
}
