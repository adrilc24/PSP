import java.io.*;
import java.util.*;

public class HolaMundo4 {

	public static void main( String[]args){
		Scanner tcl = new Scanner (System.in);
		String nombre;
		System.out.println ("Dime tu nombre");
		nombre = tcl.nextLine();
		System.out.println ("");
		for(int i=0; i<20; i++)
			System.out.println ("Hola "+nombre);

		try {
 			BufferedWriter ficheroSalida = new BufferedWriter(
			new FileWriter(new File("fichero.txt")));
			for(int i=0; i<20; i++){ 			
 				ficheroSalida.write("Hola "+nombre);
				ficheroSalida.newLine();
			}
			ficheroSalida.close();
			System.out.println("Fichero cerrado");
 		}
 		
		catch (IOException errorDeFichero) {
 			System.out.println("Ha fallado: " +errorDeFichero.getMessage() );
 		}
	}

}
