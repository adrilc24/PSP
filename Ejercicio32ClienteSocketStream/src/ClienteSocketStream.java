import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClienteSocketStream {
	public static void main(String[] args) {
		try {
			System.out.println("Creando socket cliente");
			Socket clientSocket = new Socket();
			System.out.println("Estableciendo la conexión");
			InetSocketAddress addr = new InetSocketAddress("192.168.26.125", 5555);
			clientSocket.connect(addr);
			InputStream is = clientSocket.getInputStream();
			OutputStream os = clientSocket.getOutputStream();
			
			System.out.println("Esperando 1 año");
			try {
				Thread.currentThread().sleep(20000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Enviando mensaje");
			String mensaje = "Osmeta pussydestroyer";
			os.write(mensaje.getBytes());
			System.out.println("Mensaje enviado");
			System.out.println("Cerrando el socket cliente");
			clientSocket.close();
			System.out.println("Terminado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}