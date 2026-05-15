package teoria.estructurasdecontrol_operadoreslogicos;

public class Clase1_EstructurasDeControl_OperadoresLogicos {

	public static void main(String[] args) {
		
		/*
		condicionales - tomar deciones, hacer algo basado en una regla (codiciones)
		
		if - se evalua una codicion y si se cumple ejecuto lo que hay dentro (bloque de codigo)
		bloque de codigo es lo que esta dentro de 2 llavez { }
		//esta compusto por la palabra if ( condicion ){ bloque de codigo }
		//EVALUAN/CHECAN booleanos (true/false) si el resultado es true se ejecuta
		*/
		
		boolean x = 1 > 2; // esto es falso eso quiede decir que 1>2 se convierte en false
		boolean y = 1 < 2; // esto es verdadero eso quiede decir que 1<2 se convierte en true
		
		/*
		OPERADORES LOGICOS
		Nos ayuda a hacer comparaciones de 2 valores
	    a > b si a es mayor que b
	    a < b si a es menor que b
	    a >= b si a es mayor o igual que b
	    a <= b si a es menor o igual que b
	    a == b si a es igual a b
	    a != b si a es diferente de b
		*/
		
		int a = 0;
		int b = 10;
		boolean r0 = a > b; // 0 > 10 -> false
		boolean r1 = a < b; // 0 < 10 -> true
		boolean r2 = b > a; // 10 > 0 -> true
		boolean r3 = a == b; // 0==10 -> false
		boolean r4 = a != b; // 0!=10 -> true
		
		//PODEMOS usae estas opreacion dentro del if para ejeuctar o salatar el bloque de codigo		
		if( a >= b ) {
			System.out.println("Se cumple a >= b!");
		}
		
		if( a == b ) {
			System.out.println("Se cumple a == b!");
		}
		
		//NOTA - EL == y el != solo sivern para los primitivos no para los objetos por ejemplo string
		
		/* 
		 if else
		 
		 nos ayuda a ejecutar una accion si la condcion se cumple y una accion si la condcion no se cumple
		 siempre es una u otra!
		 */
		if(a > b) {
			System.out.println("Se cumple a > b!");
		}else {
			System.out.println("No se cumple a > b!");
		}
		
		/* 
		 if else anidado
		 es cuando quires tener mas de 1 condicion y quires que solo 1 de ellas se ejecute y tiene 
		 prioridad de arriba hacia abajo
		 */
		
		if(a >= b) {
			System.out.println("Se cumple a > b!");
		}else if(a<=b) {
			System.out.println("Se cumple a < b!");
		}else if(a==b) {
			System.out.println("Se cumple a == b!");
		}else if(a!=b) {
			System.out.println("Se cumple a != b!");
		}else {
			//NOTA EL ESE AL FINAL ES COMO EL DEFUALT QUE NINGUNA CONDCION SE COMPLIO!
			//opcional
			System.out.println("Ninguna se cumplio");
		}
		

		

	}

}
