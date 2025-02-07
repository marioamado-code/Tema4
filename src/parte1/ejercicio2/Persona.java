package parte1.ejercicio2;

public class Persona {
	String nombre;
	String DNI;
	String apellidos;
	int edad;
/**
 * constructor de los datos de la persona
 * @param nombre nombre de la persona
 * @param DNI DNI de la persona
 * @param apellidos apellidos de la persona
 * @param edad edad de la persona
 */
	Persona(String nombre, String DNI, String apellidos, int edad) {
		/**
		 * comprobamos que no sea nulo en todos los casos, en la ultima ponemos que no sea negativo o 0
		 */
		if(nombre!=null&&!nombre.isBlank()) {
		this.nombre = nombre;
		}
		if(DNI!=null&&!DNI.isBlank()) { 
		this.DNI = DNI;
		}
		if(apellidos!=null&&!apellidos.isBlank()) { 
		this.apellidos = apellidos;
		}
		if(edad>0) {
		this.edad = edad;
		}
	}
}
