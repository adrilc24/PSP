import java.util.Scanner;
public class hola_mundo2 {

	public static void main( String[]args){
		Scanner tcl = new Scanner (System.in);
		String nombre;
		System.out.println ("Dime tu nombre");
		nombre = tcl.nextLine();
		System.out.println ("");
		for(int i=0; i<20; i++)
			System.out.println ("Hola "+nombre);
	}	
}
