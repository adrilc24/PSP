
public class Lanzahilos221 {
	public static void main(String[] args) {
		Reloj r = new Reloj();
		
		HiloTic hiloTic = new HiloTic("Tic", r, 15);
		HiloTac hiloTac = new HiloTac("Tac", r, 15);
		
		hiloTic.start();
		hiloTac.start();
		
	}
}