import java.io.*;
import java.util.Arrays;


public class EjemploStream3 {

	public static void main(String args[]) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("passwd");
		Process process = pb.start();

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
