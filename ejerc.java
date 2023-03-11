// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
	// Revisar si es un triángulo válido
	public class practica1{
    
    public static double calcularArea(double lado1, double lado2, double lado3) {
        
        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
            double s = (lado1 + lado2 + lado3) / 2;
            
            double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
            return area;
        } else {
          
            System.out.println("Los lados ingresados no forman un triángulo válido.");
            return -1;
        }
    }

    public static void main(String[] args) {
     
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
	public static void convertirSegundos(int segundos) {
    int horas = segundos / 3600;
    int minutos = (segundos % 3600) / 60;
    segundos = segundos % 60;
    System.out.printf("%d horas, %d minutos, %d segundos", horas, minutos, segundos);
}

	// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
  public static double volumenEsfera(double radio) {
    double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    return volumen;
}

	
	// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
	public static double volumenCono(double radio, double altura) {
    double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
    return volumen;
}

	// 7 Encontrar el area superficial de un cubo dado un lado a
  public static double areaSuperficialCubo(double lado) {
    double area = 6 * Math.pow(lado, 2);
    return area;
}


	// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no

  // 1. Escribir mostrar en pantalla los primeros 100 numeros primos
  public static void main(String[] args) {
    int count = 0;
    int num = 2;

    while (count < 100) {
        if (esPrimo(num)) {
            System.out.println(num);
            count++;
        }
        num++;
    }
}

public static boolean esPrimo(int num) {
    if (num <= 1) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }

    return true;
}

// 2. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos

// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
public static boolean esPalindromo(int numero) {
    if (numero < 0 || numero > 99) {
        return false;
    }
    int decenas = numero / 10;
    int unidades = numero % 10;
    return decenas == unidades;
}

// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
// 15. Escribir un metodo para encontrar el factorial de un numero sin loops
