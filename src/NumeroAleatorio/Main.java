package NumeroAleatorio;

import java.util.Locale;
import java.util.Scanner;
		
public class Main {
	
		  // Clase encargada de la entrada y salida del teclado
		  static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		  
		  public static void main(String[] args) {
		    int numero;
		    int respuesta;
		    boolean correcto = false;
		    
		    
		    System.out.println("Generando número");
		    // Genera un número aleatorio
		    numero = (int) (Math.random() * 100);
		    System.out.println("¿Serás capaz de averiguarlo?");
		    do {
		    	System.out.println("Dame el numero");		    	
		    	respuesta = entrada.nextInt();
		    // LÓGICA DEL JUEGO
		    // RELLENAR
		    	if (respuesta < numero) {
		    		System.out.println("Tu número es menor al número generado");
		    	}else if (respuesta > numero) {
		    		System.out.println("Tu número es mayor al número generado");
				}else
					System.out.println("Correcto!! Acertaste el número generado es: " + numero ); 
			    
		    
		    }while(numero != respuesta);
		    	
		    System.out.println("fin");
		    
		  }
		

}


