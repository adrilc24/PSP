import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class ProcessBuilder2 {
	public static void main(String[] args) throws IOException {
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		ProcessBuilder pb = new ProcessBuilder (args);
		pb.directory (new File("/home/adrcre/PSP/ProcessBuilder/bin/"));
		try {
			Process process = pb.start();
			int retorno = process.waitFor();
			System.out.println("La ejecución de " + Arrays.toString(args) + " devuelve " + retorno);
		} catch (IOException ex) {
			System.err.println("Excepción de E/S");
			System.exit(-1);
		} catch (InterruptedException ex) {
			System.err.println("El proceso hijo finalizó de forma incorrecta");
		}
	}
}