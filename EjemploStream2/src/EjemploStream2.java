import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EjemploStream2 {
	public static void main(String args[]) throws IOException {
		ProcessBuilder pb = new ProcessBuilder ("ls", "-z");
		
		Process process = pb.start();
		
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		InputStream is2 = process.getErrorStream();
		InputStreamReader isr2 = new InputStreamReader(is2);
		BufferedReader br2 = new BufferedReader(isr2);
		
		String line;
		System.out.println("Salida del proceso " + Arrays.toString(args) + " :");
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println("Salida del proceso " + Arrays.toString(args) + " :");
		while ((line = br2.readLine()) != null) {
			System.out.println(line);
		}
	}
}