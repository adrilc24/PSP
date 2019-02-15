import java.util.concurrent.Semaphore;

public class HiloSumador extends Thread{
	
	private String nombre;
	private int num;
	private Contador cont;
	private Semaphore sem; 
	
	public HiloSumador (String nombre,int num, Contador cont, Semaphore sem) {
		this.nombre = nombre;
		this.num = num;
		this.cont = cont;
		this.sem = sem;
	}
	
	public void run() {
		try {
			for (int i = 0; i < num; i++) {
				sem.acquire();
			}	
			System.out.printf("\nNombre Hilo: "+nombre+" Nº Vueltas: "+num+" Valor final: \n");
			cont.mostrarValor();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}