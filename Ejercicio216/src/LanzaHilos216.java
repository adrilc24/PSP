
public class LanzaHilos216 {

	public static void main(String[] args) {
		String nombre;
		int num;
		Contador cont = new Contador(100);
		
		HiloSumador hiloSum = new HiloSumador("Hilo Sum 1", 100, cont);
		HiloRestador hiloRes = new HiloRestador("Hilo Res 1", 100, cont);

		
		hiloSum.start();
		hiloRes.start();
		
		try {
			System.out.println("Valor inicial:");
			cont.mostrarValor();
			
			hiloSum.join();
			hiloRes.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Resultado final: ");
		cont.mostrarValor();
		
	}
}