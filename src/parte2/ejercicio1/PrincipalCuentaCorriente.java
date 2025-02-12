package parte2.ejercicio1;

import java.util.Scanner;

public class PrincipalCuentaCorriente {

	public static void main(String[] args) {
		//cuentas de usuario
		CuentaCorriente cc1 = new CuentaCorriente("28787899K", 999, "mario", "ESPAÑOLA");
		CuentaCorriente cc2 = new CuentaCorriente("87656788I", 666, "marco", "EXRTRANJERA");
		//opciones del switch
		int opcion;
		//cantidad de dinero que se embolsa o se quita
		double cantidad;
		//para salir del bucle principal de la clase
		boolean quedarse=true;
		//escaner
		Scanner sc = new Scanner(System.in);
		
		do {
			//opciones
		System.out.println("1.Sacar dinero,2.ingresar dinero, 3.imprimir cuenta, 4.comparar cuentas, otra cosa para terminar");
		opcion = sc.nextInt();
		switch (opcion) {
		//caso uno se introduce cantidad siempre que la funcion devuelva true
		case 1 -> {
			System.out.println("Introduce cantidad");
			cantidad = sc.nextDouble();
			if (cc1.sacarDinero(cantidad)) {
				System.out.println("Operacion exitosa");

			} else {
				System.out.println("Operacion fallida");

			}

		}
		//en el caso 2 se suma siempre que no sea ni cero ni negativo
		case 2 -> {
			System.out.println("Introduce cantidad");
			cantidad = sc.nextDouble();
			if (cc1.meterDinero(cantidad)) {
				System.out.println("Operacion exitosa");

			} else {
				System.out.println("Operacion fallida");

			}

		}
		//se imprime cc1
		case 3 -> {
			System.out.println(cc1);

		}
		//se comparan 
		case 4 -> {
			System.out.println(cc1.equals(cc2));
		}
		//si no es ninguna de las opciones sale del bucle
		default->{
			quedarse=false;
		}
		}
		}while(quedarse);
		sc.close();
	}

}
