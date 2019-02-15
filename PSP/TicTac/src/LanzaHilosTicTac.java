
public class LanzaHilosTicTac {
	public static void main(String[] args) {

		Reloj reloj = new Reloj();
		HiloTic hiloTic = new HiloTic("HiloTic1", reloj, 6);
		HiloTic hiloTic2 = new HiloTic("HiloTic2", reloj, 3);
		HiloTac hiloTac = new HiloTac("HiloTac1", reloj, 6);

		hiloTic.start();
		hiloTic2.start();
		hiloTac.start();
		
		
		
	}

}
