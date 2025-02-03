package parte1.ejercicio3;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		Rectangulo rect1=new Rectangulo();
		Rectangulo rect2=new Rectangulo();
		rect1.x1=0;
		rect1.y1=0;
		rect1.x2=5;
		rect1.y2=5;
		
		rect2.x1=7;
		rect2.y1=9;
		rect2.x2=2;
		rect2.y2=3;
		rect1.perimetro=(Math.abs(rect1.x1+rect1.x2)+Math.abs(rect1.x1+rect1.y1)+Math.abs(rect1.x2+rect1.y2)+Math.abs(rect1.y1+rect1.y2));
		rect1.area=(Math.abs(rect1.x1-rect1.x2)*Math.abs(rect1.y2-rect1.y1));
		
		rect2.perimetro=(Math.abs(rect2.x1+rect2.x2)+Math.abs(rect2.x1+rect2.y1)+Math.abs(rect2.x2+rect2.y2)+Math.abs(rect2.y1+rect2.y2));
		rect2.area=(Math.abs(rect2.x1-rect2.x2)*Math.abs(rect2.y2-rect2.y1));
		System.out.println("("+rect1.x1+","+rect1.y1+")"+"("+rect1.x2+","+rect1.y2+")"+rect1.perimetro+" "+rect1.area);
		System.out.println("("+rect2.x1+","+rect2.y1+")"+"("+rect2.x2+","+rect2.y2+")"+rect2.perimetro+" "+rect2.area);
		
		rect2.y1+=3;
		rect2.x2--;
		rect1.x2++;
		rect1.y2-=2;
		rect1.perimetro=(Math.abs(rect1.x1+rect1.x2)+Math.abs(rect1.x1+rect1.y1)+Math.abs(rect1.x2+rect1.y2)+Math.abs(rect1.y1+rect1.y2));
		rect1.area=(Math.abs(rect1.x1-rect1.x2)*Math.abs(rect1.y2-rect1.y1));
		
		rect2.perimetro=(Math.abs(rect2.x1+rect2.x2)+Math.abs(rect2.x1+rect2.y1)+Math.abs(rect2.x2+rect2.y2)+Math.abs(rect2.y1+rect2.y2));
		rect2.area=(Math.abs(rect2.x1-rect2.x2)*Math.abs(rect2.y2-rect2.y1));
		System.out.println("("+rect1.x1+","+rect1.y1+")"+"("+rect1.x2+","+rect1.y2+")"+rect1.perimetro+" "+rect1.area);
		System.out.println("("+rect2.x1+","+rect2.y1+")"+"("+rect2.x2+","+rect2.y2+")"+rect2.perimetro+" "+rect2.area);
		
	}

}
