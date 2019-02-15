package productor_consumidro;
import java.util.*;

public class Consumidor extends Thread{
	private Buffer b;
	private int iter;
	
	public Consumidor (Buffer b, int iter) {
		this.b = b;
		this.iter = iter;
	}
	
	@Override
	public void run() {
		for (int i=0; i<iter; i++) {
			int aux;
			try {
				aux = b.extraer();
				System.out.println(i+": Consumidor consume -->" +aux);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
	}
	
}
