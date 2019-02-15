
public class HiloTic extends Thread{
	private Reloj reloj;
	private int n;
	
	public HiloTic (String nombre, Reloj reloj, int n) {
		super(nombre);
		this.reloj = reloj;
		this.n = n;
	}
	
	@Override
	public void run() {
		int it = 0;
		while(it < n) {
			System.out.println(getName() + " llama a Tic " + it);
			reloj.tic();
			it++;
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
