// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
	// Revisar si es un triángulo válido
	public class practica1{
    
    public static double calcularArea(double lado1, double lado2, double lado3) {
        // Verificar si los lados forman un triángulo válido
        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
            // Calcular el semiperímetro
            double s = (lado1 + lado2 + lado3) / 2;
            // Aplicar la fórmula de Herón para calcular el área
            double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
            return area;
        } else {
            // Los lados no forman un triángulo válido
            System.out.println("Los lados ingresados no forman un triángulo válido.");
            return -1;
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double lado1 = 10;
        double lado2 = 8;
        double lado3 = 7;
        double area = calcularArea(lado1, lado2, lado3);
        System.out.println("El área del triángulo es: " + area);
    }
}


	// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
	// Utilizar PI de la libreria de Java
	package practica1;
import java.lang.Math;

  public class practica1{

  	public static void areaCircunferencia(double radio) {
	    double pi = Math.PI;
	    double area = pi * Math.pow(radio, 2);
	    double circunferencia = 2 * pi * radio;

	    System.out.println("El área del círculo es: " + area);
	    System.out.println("La circunferencia del círculo es: " + circunferencia);
	
	}
}

	// 3 Escribir un metodo que muestre por consola la hora del sistema
	// Utilizar e investigar la libreria de Java

	// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
	// ej 3600 = "1 hora = 60 min = 3600 seg"
	
	// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	
	// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
	
	// 7 Encontrar el area superficial de un cubo dado un lado a

	// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no

  // 1. Escribir mostrar en pantalla los primeros 100 numeros primos
// 2. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos

