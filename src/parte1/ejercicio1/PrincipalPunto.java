package parte1.ejercicio1;

public class PrincipalPunto {

	public static void main(String[] args) {
		/**
		 * ponemos los puntos
		 */
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		Punto p3 = new Punto();

		p1.setX(5);
		p1.setY(0);

		p2.setX(10);
		p2.setY(10);

		p3.setX(-3); // Este valor no se asignará, ya que es negativo
		p3.setY(7);

		// Imprimimos los valores iniciales usando getters
		System.out.println("Punto 1: " + p1.toString());  // "(3, 4)"
        System.out.println("Punto 2: " + p2.toString());  // "(6, 8)"
        System.out.println("Punto 3: " + p3.toString()); 
		// Modificamos los puntos
		p1.setX(p1.getX() + 1); // Incrementa x de p1
		p2.setY(p2.getY() - 1); // Decrementa y de p2
		p3.setX(p3.getX() - 1); // Decrementa x de p3 (este no cambiará porque el valor de p3.x nunca fue
								// asignado correctamente)
		p3.setY(p3.getY() + 1); // Incrementa y de p3
		p1.desplaza(2, 3);
        System.out.println("Punto 1 después de desplazar: " + p1.toString());
        
        double distancia = p1.distancia(p2);
        System.out.println("Distancia entre Punto 1 y Punto 2: " + distancia);
		
        
        p3.setX(5);
        p3.setY(6);
        System.out.println("Punto 3 después de modificación: " + p3.toString());
	}
}
