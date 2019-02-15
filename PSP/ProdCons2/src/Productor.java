import java.util.Random;

public class Productor implements Runnable{

	private Random rand;
	private Buffer buff;
	private int idproductor;
	
	public Productor(Buffer buff, int idproductor) {
		this.buff = buff;
		this.idproductor = idproductor;
		rand = new Random();
	}
	
	@Override
	public void run() {
		while (true) {
			int poner = rand.nextInt(300);
			buff.put(poner);
			System.out.println("El productor "+ idproductor + " pone: "+ poner);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
