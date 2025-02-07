package parte1.ejercicio1;

public class Punto {
	/**
	 * atributos
	 */
	private int x;
	private int y;
	public int getX(){
		return x;
	}

	public void setX(int x) {
		if (x >= 0) {
			this.x = x;
		}
	}
	public int getY(){
		return y;
	}

	public void setY(int y) {
		if (y>= 0) {
			this.y = y;
		}
	}
	/**
     * Método para desplazar el punto por dx en x y dy en y
     */
    public void desplaza(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Método para calcular la distancia entre el punto actual (this) y otro punto (p)
     */
    public double distancia(Punto p) {
        // Fórmula de la distancia entre dos puntos (x1, y1) y (x2, y2):
        // sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
    }

    /**
     * Método toString para devolver una representación en cadena del punto
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

