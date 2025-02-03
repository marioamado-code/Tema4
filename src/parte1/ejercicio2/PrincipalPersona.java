package parte1.ejercicio2;
import java.util.Scanner;
public class PrincipalPersona {

	public static void main(String[] args) {
		Persona per1=new Persona();
		Persona per2=new Persona();
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca DNI");
		per1.DNI=sc.next();
		sc.nextLine();
		System.out.println("Introduzca nombre");
		per1.nombre=sc.nextLine();
		System.out.println("Apellidos");
		per1.apellidos=sc.nextLine();
		System.out.println("Edad");
		per1.edad=sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca DNI");
		per2.DNI=sc.next();
		sc.nextLine();
		System.out.println("Introduzca nombre");
		per2.nombre=sc.nextLine();
		System.out.println("Apellidos");
		per2.apellidos=sc.nextLine();
		System.out.println("Edad");
		per2.edad=sc.nextInt();
		
		
		System.out.print(per1.DNI+" "+per1.nombre+" "+per1.apellidos+" "+per1.edad);
		if(per1.edad<18) {
			System.out.println(", es menor de edad");
		}else {
			System.out.println(", es mayor de edad");
		}
		System.out.print(per2.DNI+" "+per2.nombre+" "+per2.apellidos+" "+per2.edad);
		if(per2.edad<18) {
			System.out.println(", es menor de edad");
		}else {
			System.out.println(", es mayor de edad");
		}
		sc.close();

	}

}
