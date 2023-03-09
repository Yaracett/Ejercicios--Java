
package ejerciciosLogicos;

import java.text.MessageFormat;
import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		


Scanner myScanner = new Scanner(System.in);
				//mensaje para qie el usuario ingrese sus datos
				System.out.println("ingresa valor de x");
				//Guardamos en una variable string lo que ingresó el usuario de la consola
			   int valorX = myScanner.nextInt();
				//mensaje con la variable perevia de manera concatenada
				System.out.println("valor de X: " + valorX);
				
				System.out.println("ingresa valor de Y");
				 int valorY = myScanner.nextInt();
				 
				 int Xdouble= valorX;
				 int Ydouble = valorY;
				 
				 String binaryX = Integer.toString(valorX);
				 String binaryY = Integer.toString(valorY);
				 
				 if (valorX > valorY) {
			            System.out.println(valorX + " es mayor que " + valorY);
			        } else if (valorY > valorX) {
			            System.out.println(valorY + " es mayor que " + valorX);
			        } else {
			            System.out.println(valorX + " y " + valorY + " son iguales");
			        }

			        // Obtener el promedio
			        double promedio = (valorX + valorY) / 2;
			        System.out.println("El promedio de " + valorX + " y " + valorY + " es " + promedio);

			        
				 
				 
				 
				 
				
				myScanner.close();
		
	}
}
