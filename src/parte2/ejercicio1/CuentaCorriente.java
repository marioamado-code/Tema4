package parte2.ejercicio1;

public class CuentaCorriente {
	// atributos privados dni nombre y sueldo de la persona
	private String DNI = "";
	private String nombre = "";
	private double saldo = 0;

//nacionalidad que solo puede ser una de estas dos
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

//la iniciamos
	private Nacionalidad nacion = Nacionalidad.ESPAÑOLA;

//primer constructor
	public CuentaCorriente(String DNI, double saldo) {
		// el dni debe ser de 9 no nulo y no estar vacio
		if (DNI.length() == 9 && DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		// el saldo debe ser mayor que 0
		if (saldo > 0) {
			this.saldo = saldo;
		}

	}

//segundo constructor
	public CuentaCorriente(String DNI, double saldo, String nombre) {
		// el dni debe ser de 9 no nulo y no estar vacio
		if (DNI.length() == 9 && DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		// el saldo debe ser mayor que 0
		if (saldo > 0) {
			this.saldo = saldo;
		}
		//el nombre no debe ser nulo ni vacio
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	public CuentaCorriente(String DNI, double saldo, String nombre, String nacion) {
		// el dni debe ser de 9 no nulo y no estar vacio
		if (DNI.length() == 9 && DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		// el saldo debe ser mayor que 0
		if (saldo > 0) {
			this.saldo = saldo;
		}
		//el nombre no debe ser nulo ni vacio
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
			
			
		}
		
		if(!nacion.equals("ESPAÑOLA")) {
			this.nacion = Nacionalidad.EXTRANJERA;
		}
	}
	
}