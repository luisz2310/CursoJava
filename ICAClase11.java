import java.util.Scanner;

/**
 * Write a description of class ICAClase11 here.
 * 
 * @author (jessica) 
 * @version (22/07/2022)
 */
public class ICAClase11
{
     public static void main (String args[]){
         float sumtodo=0;
         float resint=0;
         float resint3=0;
         float resint4=0;
         float resint5=0;
         float resint6=0;
         float resint7=0;
        Scanner s = new Scanner (System.in);
        System.out.println("Introduzca su porcentaje de ganancia mensual");
        float porcentaje = s.nextFloat();
        System.out.println("Introduzca cuanto guardara en su primer mes:");
        int mes1 = s.nextInt();
            if(mes1<porcentaje){
                float interes=0;
                int total=0;
                total=total+mes1;
                System.out.printf("**"+"Ahorro  " +mes1 + " Interes  "+interes + " Total" +total);
                }else{
                float interes=0;
                int total=0;
                total=total+mes1;
                System.out.printf("Ahorro  "+mes1 + " Interes  "+interes + " Total  "+total);
            }
        System.out.println("                                            ");
        System.out.println("Introduzca cuanto guardara en su segundo mes:");
        int mes2 = s.nextInt();
            if(mes2<porcentaje){
                int meses=0;
                meses=mes1+mes2;
                resint=(porcentaje/100)*mes1;
                sumtodo=resint+meses;
                System.out.printf("** "+" Ahorro  "+meses + " Interes  "+resint + " Total  "+sumtodo);
                }else{
                float meses=0;
                resint=(porcentaje/100)*mes1;
                meses=mes1+mes2;
                sumtodo=resint+meses;
                System.out.printf("Ahorro  "+meses + " Interes  "+resint + "  Total  "+sumtodo);
                }
        System.out.println("                                            ");
        System.out.println("Introduzca cuanto guardara en su tercer mes:");
        int mes3 = s.nextInt();
            if(mes3<porcentaje){
                int meses3=0;
                int meses=0;
                meses3=mes1+mes2+mes3;
                resint3=(porcentaje/100)*mes3; 
                sumtodo=meses3+resint3+resint;
                System.out.printf("** "+" Ahorro  "+meses3 + " Interes  "+resint3 + " Total  "+sumtodo);
                }else{
                int meses3=0;
                int meses=0;
                meses3=mes1+mes2+mes3;
                resint3=(porcentaje/100)*mes3;
                sumtodo=meses3+resint3+resint;
                System.out.printf(" Ahorro  "+meses3 + " Interes  "+resint3 + " Total  "+sumtodo);
                }
                System.out.println("                                            ");
        System.out.println("Introduzca cuanto guardara en su cuarto mes:");
        int mes4 = s.nextInt();
            if(mes4<porcentaje){
                int meses4=0;
                int meses=0;
                meses4=mes1+mes2+mes3+mes4;
                resint4=(porcentaje/100)*mes4; 
                sumtodo=meses4+resint4+resint3;
                System.out.printf("** "+" Ahorro  "+meses4 + " Interes  "+resint4 + " Total  "+sumtodo);
                }else{
                int meses4=0;
                int meses=0; 
                meses4=mes1+mes2+mes3+mes4;
                resint4=(porcentaje/100)*mes4;
                sumtodo=meses4+resint4+resint3;
                System.out.printf(" Ahorro  "+meses4 + " Interes  "+resint4 + " Total  "+sumtodo);
                }
             System.out.println("                                            ");
            System.out.println("Introduzca cuanto guardara en su quinto mes:");
                int mes5 = s.nextInt();
            if(mes5<porcentaje){
                int meses5=0;
                int meses=0;
                meses5=mes1+mes2+mes3+mes4+mes5;
                resint5=(porcentaje/100)*mes5; 
                sumtodo=meses5+resint5+resint4;
                System.out.printf("** "+" Ahorro  "+meses5 + " Interes  "+resint5 + " Total  "+sumtodo);
                }else{
                int meses5=0;
                int meses=0; 
                meses5=mes1+mes2+mes3+mes4;
                resint5=(porcentaje/100)*mes5;
                sumtodo=meses5+resint5+resint4;
                System.out.printf(" Ahorro  "+meses5 + " Interes  "+resint5 + " Total  "+sumtodo);
                }
            System.out.println("                                            ");
            System.out.println("Introduzca cuanto guardara en su sexto mes:");
                int mes6 = s.nextInt();
                if(mes6<porcentaje){
                    int meses6=0;
                    int meses=0;
                    meses6=mes1+mes2+mes3+mes4+mes5+mes6;
                    resint6=(porcentaje/100)*mes6; 
                    sumtodo=meses6+resint5+resint6;
                    System.out.printf("** "+" Ahorro  "+meses6 + " Interes  "+resint6 + " Total  "+sumtodo);
                    }else{
                    int meses6=0;
                    int meses=0; 
                    meses6=mes1+mes2+mes3+mes4+mes5+mes6;
                    resint6=(porcentaje/100)*mes6; 
                    sumtodo=meses6+resint5+resint6;
                    System.out.printf(" Ahorro  "+meses6 + " Interes  "+resint6 + " Total  "+sumtodo);
                    }
            System.out.println("                                            ");
            System.out.println("Introduzca cuanto guardara en su septimo mes:");
                int mes7 = s.nextInt();
            if(mes7<porcentaje){
                int meses7=0;
                int meses=0;
                meses7=mes1+mes2+mes3+mes4+mes5+mes6+mes7;
                resint7=(porcentaje/100)*mes7; 
                sumtodo=meses7+resint6+resint7;
                System.out.printf("** "+" Ahorro  "+meses7 + " Interes  "+resint7 + " Total  "+sumtodo);
                }else{
                int meses7=0;
                int meses=0; 
                meses7=mes1+mes2+mes3+mes4+mes5+mes6+mes7;
                resint7=(porcentaje/100)*mes7; 
                sumtodo=meses7+resint6+resint7;
                System.out.printf(" Ahorro  "+meses7 + " Interes  "+resint7 + " Total  "+sumtodo);
                }
            }
}

