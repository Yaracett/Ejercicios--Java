package ejerciciosLogicos;

import java.text.MessageFormat;
import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		
		/*
		//creamos neuva instancia de el objeto scanner
		
		//System.out.println("Hola mundo");
		Scanner myScanner = new Scanner(System.in);
		//mensaje para qie el usuario ingrese sus datos
		System.out.println("Enter username");
		//Guardamos en una variable string lo que ingresó el usuario de la consola
		String username = myScanner.nextLine();
		//mensaje con la variable perevia de manera concatenada
		System.out.println("Username is: " + username);
		
		myScanner.close();
		*/
		
		
		//utilizar el tipo de datos primitivo o no primitivos informacion personal no delicada
		//edad
		//fecha de nacimiento
		//iniciales
		//peso/ altura /tamaño valzado
		//ciudad de nacimiento
		//nacionalidad
		//signo zodiacal
		//signo ascendente
		//signo lunar
		//comida fav
		//lista de comida fav MAX 3
		//tipo de personalidad segun MBTI
		/*
		int edad = 31;
		String birthday = "17-sep-1991";
		char inicial= 'Y';
		float altura =1.55f;
		String ciudadDeNac ="Acapulco";
		String nacionalidad ="Mexicana";
		String signoZodiacal ="Virgo";
		String ascendente ="Tauro";
		String signoLunar = "Capricornio";
		String comidaFav = "Pozole verde, Enchiladas verdes, chilaquiles verdes";
		String tipoDePersonalidad = "Kiara";
		
		//MessageFormat nos permite concatenar por medio de iniciales diferentes variables en un string
		String msg = MessageFormat.format("Soy:{0} \nFecha de nacimiento: {1} \nAltura: {2} \nCiudad de nacimiento {3}", inicial,birthday,altura,ciudadDeNac);
		System.out.println(msg);
		*/
		
		//////////////////CASTING
		/*
		int calf1 = 10;
		int calf2 = 7;
		int calf3 = 10;
		int calf4 = 4;
		
		//wide casting(auto)
		//double avg = (calf1 + calf2 + calf3 + calf4) / 4.0;
        //narroe casting (manual)
		
		double avg = ((double)calf1 + (double)calf2 + (double)calf3 + (double)calf4) / 4.0;
		System.out.print(avg);
		System.out.println((double)  3);
		
		
		//comillas sencillas o singulares son para tipos de datos caracter y no strin(para string son dobles)
		System.out.println("hola");
		
		System.out.println(4%3);
		*/
		//pedir 2 numeros X y Y
		//1. convertir a doblr cada numero
		//2. tomar las variables enteras y convertir a datos binaris
		//3. mostrar el número mayor
		//4. obtener el promedio de X y Y
		
		//creamos neuva instancia de el objeto scanner
		
		int X;
		int Y;
			
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

			        //input.close();
				 
				 
				 
				 
				
				myScanner.close();
		
	}
}
