package parte1.ejercicio4;

public class Articulo {
String nombre;
double precio;
final int iva=21;
int cuantosQuedan;
/**
 * constructor del objeto articulo
 * @param nombre
 * @param precio
 * @param cuantosQuedan
 */
Articulo (String nombre,double precio,int cuantosQuedan){
	/**
	 * comprobamos que el valor sea valido, en nombre que no sea nada y en los otros que sea mayor que 0
	 */
	if(nombre!=null&&!nombre.isBlank()) {
		this.nombre = nombre;}
	if(precio>0) {
		this.precio=precio;
	}
	if(cuantosQuedan>0) {
		this.cuantosQuedan=cuantosQuedan;
	}
}
}
