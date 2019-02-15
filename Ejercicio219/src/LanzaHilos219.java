import java.util.concurrent.Semaphore;

public class LanzaHilos219 {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(0);
		String nombre;
		int num;
		Contador cont = new Contador(100);
		
		HiloSumador hiloSum = new HiloSumador("Hilo Sum 1", 100, cont, semaphore);

		hiloSum.start();
		
		try {
			System.out.println("Valor inicial:");
			cont.mostrarValor();
			hiloSum.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Resultado final: ");
		cont.mostrarValor();		
	}
}