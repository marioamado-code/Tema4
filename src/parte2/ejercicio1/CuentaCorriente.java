package parte2.ejercicio1;

public class CuentaCorriente {
	// atributos privados dni nombre y sueldo de la persona
	private String DNI = "";
	private String nombre = "";
	private double saldo = 0;

//nacionalidad que solo puede ser una de estas dos
	private enum Nacionalidad {
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
		//si no es española es extranjera
		if(!nacion.equals("ESPAÑOLA")) {
			this.nacion = Nacionalidad.EXTRANJERA;
		}
	}
	//getters y setters
	public String getDNI() {
		return DNI;
		
	}
	public String getnombre() {
		return nombre;
		
	}
	public double getSaldo() {
		return saldo;
		
	}
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public void setNacionalidad(Nacionalidad nacion) {
		this.nacion=nacion;
	}
	public Nacionalidad getNacion() {
		return nacion;
	}
	//funcion sacar dinero y se actualiza el saldo
	public boolean sacarDinero(double cantidad) {
		boolean exito=false;
		
		if(saldo-cantidad>=0) {
			exito=true;
			setSaldo(saldo-cantidad);
		}
		
		return exito;
	}
	//funcion meter dinero y se actualiza el saldo
	public boolean meterDinero(double cantidad) {
		boolean exito=false;
		
		if(cantidad>=0) {
			exito=true;
			setSaldo(saldo+cantidad);
		}
		
		return exito;
	}
	//se imprime la cadena
	@Override
	public String toString() {
		String res="";
		res="DNI: "+DNI+" ";
		res+="Nombre: "+nombre+" ";
		res+="saldo: "+saldo+" ";
		res+="nacionalidad :"+nacion+" ";
		return res;
	}
	//se comparan las cuentas si son iguales los dos campos
	@Override
	public boolean equals(Object obj) {
		boolean isequal=false;
		CuentaCorriente cc2=(CuentaCorriente)obj;
		if(this.DNI.equals(cc2.DNI)&&this.nombre.equals(cc2.nombre)) {
			isequal=true;
		}
		return isequal;
	}
	
}