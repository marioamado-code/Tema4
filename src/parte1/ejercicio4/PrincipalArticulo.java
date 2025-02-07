package parte1.ejercicio4;

public class PrincipalArticulo {

	public static void main(String[] args) {
/**
 * variable local para calcular el precio real
 */
		double pvp;
/**
 * primer articulo correctom lo iniciamos con valores correctos
 */
		Articulo art1 = new Articulo("pijama", 3.48, 87);
		/**
		 * calculamos el precio con iva
		 */
		pvp = art1.precio * (1 + (double) art1.iva / 100);
/**
 * lo imprimimos
 */
		System.out.println(art1.nombre + " " + art1.precio + " " + art1.iva + " " + pvp + " " + art1.cuantosQuedan);
/**
 * creamos una con un error y al imprimirlo se genera el valor por defecto
 */
		Articulo art2 = new Articulo("armario", -98, -56);
		pvp = art2.precio * (1 + (double) art2.iva / 100);
		System.out.println(art2.nombre + " " + art2.precio + " " + art2.iva + " " + pvp + " " + art2.cuantosQuedan);
	}

}
