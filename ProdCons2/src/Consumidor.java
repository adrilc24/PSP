
public class Consumidor implements Runnable{

	private Buffer buff;
	private int id;
	
	public Consumidor (Buffer buff, int id) {
		this.buff = buff;
		this.id = id;
	}
	
	
	public void run() {
		while(true) {
			System.out.println("El consumidor "+ id + " consume: "+ buff.get());
		}
	}
	
}
