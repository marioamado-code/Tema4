package parte2.ejercicio1;

public class CuentaCorriente {
private String DNI;
private String nombre;
private double saldo;
enum Nacionalidad {ESPAÑOLA,EXTRANJERA};
private Nacionalidad nacion;
public CuentaCorriente(String DNI,double saldo) {
	this.DNI=DNI;
	this.saldo=saldo;
	
}
public CuentaCorriente(String DNI,double saldo,String nombre) {
	this.DNI=DNI;
	this.saldo=saldo;
	this.nombre=nombre;
	
}
public CuentaCorriente(String DNI,double saldo,String nombre,String nacionalidad) {
	this.DNI=DNI;
	this.saldo=saldo;
	this.nombre=nombre;
	this.nacion=Nacionalidad.valueOf(nacionalidad);
	
	
}
}
