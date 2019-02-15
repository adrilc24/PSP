import java.util.concurrent.Semaphore;

public class LanzaHilos {

	public static void main(String[] args) {
		Contador contador = new Contador(100);
		Semaphore sem  = new Semaphore(10);
		
		HiloSumador hiloSum = new HiloSumador("Sumador", contador,300, sem);
		HiloRestador hiloRes = new HiloRestador("Restador", contador, 300, sem);
		HiloSumador hiloSum2 = new HiloSumador("Sum2", contador, 200, sem);
		
		hiloSum.start();
		hiloRes.start();
		hiloSum2.start();
		
		try {
			hiloSum.join();
			hiloRes.join();
			hiloSum2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Valor del contador: " + contador.mostrarValor());
		System.out.println("Programa finalizado");
	}

}
