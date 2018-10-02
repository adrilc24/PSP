import java.io.IOException;
import java.util.Scanner;

public class RunTimeEj {
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		Runtime runtime = Runtime.getRuntime();

		try {		
			Process process = runtime.exec(args);
			Scanner tcl = new Scanner(System.in);
			System.out.println("Pulse una tecla para destruir");
			tcl.nextLine();
			process.destroy();
			System.out.println("HA SIDO DESTRUIDO!!!!");
		} catch (IOException ex) {
			System.err.println("Excepción de E/S");
			System.exit(-1);
		}
	}
}