import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;

public class EjemploStream5 {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("ls ", "-la ");
		ProcessBuilder pb2 = new ProcessBuilder("tr ", "d ", "D");
		Process process = pb.start();
		Process process2 = pb2.start();

		InputStream is = (InputStream) process.getInputStream();
		InputStream err = (InputStream) process.getErrorStream();

		InputStreamReader isr = new InputStreamReader(err);
		BufferedReader br = new BufferedReader(isr);

		InputStreamReader isr2 = new InputStreamReader(is);
		BufferedReader br2 = new BufferedReader(isr2);

		OutputStream os = (OutputStream) process.getOutputStream();
		os.write("Adrian\n".getBytes());
		os.write("Adrian\n".getBytes());
		os.write("Adrian\n".getBytes());
		os.flush();

		int cont;
		while ((cont = br.read()) != -1)
			System.out.print((char) cont);
		String line;
		System.out.println("Salida del proceso " + Arrays.toString(args) + " :");
		while ((line = br2.readLine()) != null) {
			System.out.println(line);
		}
	}
}