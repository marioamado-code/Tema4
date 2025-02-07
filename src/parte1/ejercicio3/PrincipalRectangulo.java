package parte1.ejercicio3;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		/**
		 * se asocia el rectangulo con los datos
		 */
		Rectangulo rect1=new Rectangulo(0,5,0,5);
		Rectangulo rect2=new Rectangulo(2,7,3,9);
		/**
		 * se calcula el perimetro mediante el valor absoluto de la suma de puntos contiguos
		 */
		
		rect1.perimetro=(Math.abs(rect1.x1+rect1.x2)+Math.abs(rect1.x1+rect1.y1)+Math.abs(rect1.x2+rect1.y2)+Math.abs(rect1.y1+rect1.y2));
		/**
		 * se calcula el area por la multiplicacion del valor absoluto de la suma de dos puntos con dos puntos adyacentes
		 */
		rect1.area=(Math.abs(rect1.x1-rect1.x2)*Math.abs(rect1.y2-rect1.y1));
		/**
		 * hacemos lo mismo con la otra figura
		 */
		rect2.perimetro=(Math.abs(rect2.x1+rect2.x2)+Math.abs(rect2.x1+rect2.y1)+Math.abs(rect2.x2+rect2.y2)+Math.abs(rect2.y1+rect2.y2));
		rect2.area=(Math.abs(rect2.x1-rect2.x2)*Math.abs(rect2.y2-rect2.y1));
		/**
		 * imprimimos
		 */
		System.out.println("("+rect1.x1+","+rect1.y1+")"+"("+rect1.x2+","+rect1.y2+")"+rect1.perimetro+" "+rect1.area);
		System.out.println("("+rect2.x1+","+rect2.y1+")"+"("+rect2.x2+","+rect2.y2+")"+rect2.perimetro+" "+rect2.area);
		/**
		 * modificamos los puntos
		 */
		rect2.y1+=3;
		rect2.x2--;
		rect1.x2++;
		rect1.y2-=2;
		/**
		 * y volvemos a hacer lo mismo
		 */
		rect1.perimetro=(Math.abs(rect1.x1+rect1.x2)+Math.abs(rect1.x1+rect1.y1)+Math.abs(rect1.x2+rect1.y2)+Math.abs(rect1.y1+rect1.y2));
		rect1.area=(Math.abs(rect1.x1-rect1.x2)*Math.abs(rect1.y2-rect1.y1));
		
		rect2.perimetro=(Math.abs(rect2.x1+rect2.x2)+Math.abs(rect2.x1+rect2.y1)+Math.abs(rect2.x2+rect2.y2)+Math.abs(rect2.y1+rect2.y2));
		rect2.area=(Math.abs(rect2.x1-rect2.x2)*Math.abs(rect2.y2-rect2.y1));
		System.out.println("("+rect1.x1+","+rect1.y1+")"+"("+rect1.x2+","+rect1.y2+")"+rect1.perimetro+" "+rect1.area);
		System.out.println("("+rect2.x1+","+rect2.y1+")"+"("+rect2.x2+","+rect2.y2+")"+rect2.perimetro+" "+rect2.area);
		
	}

}
