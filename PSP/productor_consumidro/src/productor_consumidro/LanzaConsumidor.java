package productor_consumidro;

public class LanzaConsumidor {
	public static void main (String[] args) {
		Buffer b = new Buffer(5);
		Productor p = new Productor(b, 100);
		Consumidor c = new Consumidor(b, 100);
		
		p.start();
		c.start();
	}
}