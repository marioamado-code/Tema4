package parte1.ejercicio3;

public class Rectangulo {
	/**
	 * parametros del rectangulo
	 */
int x1;
int x2;
int y1;
int y2;
int perimetro;
int area;
/**
 * 
 * @param x1 eje horizontal de la izquierda
 * @param x2 eje horizontal de la derecha
 * @param y1 eje vertical de abajo
 * @param y2 eje vertical de arriba
 */
Rectangulo(int x1,int x2,int y1, int y2){
	if(x1<x2&&y1<y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
}
}
