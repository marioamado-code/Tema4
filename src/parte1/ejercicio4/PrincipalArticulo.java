package parte1.ejercicio4;

public class PrincipalArticulo {

	public static void main(String[] args) {
		Articulo objeto = new Articulo();
		double pvp;
		objeto.nombre = "pijama";
		objeto.precio = 10;
		objeto.iva = 21;
		pvp = objeto.precio * (1 + (double) objeto.iva / 100);
		objeto.cuantosQuedan = 48;
		System.out.println(
				objeto.nombre + " " + objeto.precio + " " + objeto.iva + " " + pvp + " " + objeto.cuantosQuedan);
		objeto.cuantosQuedan--;
		objeto.precio += 13;
		pvp = objeto.precio * (1 + (double) objeto.iva / 100);
		System.out.println(
				objeto.nombre + " " + objeto.precio + " " + objeto.iva + " " + pvp + " " + objeto.cuantosQuedan);
	}

}
