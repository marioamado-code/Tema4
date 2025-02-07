package parte1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		/**
		 * creamos los objetos persona 1 y 2
		 */
		Persona per1;
		Persona per2;
		/**
		 * variables locales
		 */
		String nombre;
		String DNI;
		String apellidos;
		int edad;
		/**
		 * escaner
		 */
		Scanner sc = new Scanner(System.in);
		/**
		 * pedimos los datos en el dni y nombre no permitimos espacios y limpiamos el
		 * buffer
		 */
		System.out.println("Introduzca DNI");
		DNI = sc.next();
		sc.nextLine();
		System.out.println("Introduzca nombre");
		nombre = sc.nextLine();
		System.out.println("Apellidos");
		apellidos = sc.nextLine();
		System.out.println("Edad");
		edad = sc.nextInt();
		sc.nextLine();
		/**
		 * almacenamos esos datos en persona 1
		 */
		per1 = new Persona(nombre, DNI, apellidos, edad);

		/**
		 * pedimos los datos para la persona 2 haciendo lo mismo
		 */
		System.out.println("Introduzca DNI");
		DNI = sc.next();
		sc.nextLine();
		System.out.println("Introduzca nombre");
		nombre = sc.nextLine();
		System.out.println("Apellidos");
		apellidos = sc.nextLine();
		System.out.println("Edad");
		edad = sc.nextInt();
		/**
		 * lo asignamos a persona 2
		 */
		per2 = new Persona(nombre, DNI, apellidos, edad);
		/**
		 * una vez asignados comprobamos su mayoria o no y lo imprimimos con los datos y
		 * el mensaje de si lo es o no
		 */
		System.out.print(per1.DNI + " " + per1.nombre + " " + per1.apellidos + " " + per1.edad);
		if (per1.edad < 18) {
			System.out.println(", es menor de edad");
		} else {
			System.out.println(", es mayor de edad");
		}
		System.out.print(per2.DNI + " " + per2.nombre + " " + per2.apellidos + " " + per2.edad);
		if (per2.edad < 18) {
			System.out.println(", es menor de edad");
		} else {
			System.out.println(", es mayor de edad");
		}
		/**
		 * cerramos escaner
		 */
		sc.close();

	}

}
