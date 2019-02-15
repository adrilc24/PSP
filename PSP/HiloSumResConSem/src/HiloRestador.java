import java.util.concurrent.Semaphore;

public class HiloRestador extends Thread {

	private String nombre;
	private int numero;
	private Contador contador;
	private Semaphore sem;
	public HiloRestador(String nombre, Contador contador, int numero, Semaphore sem) {
		super(nombre);
		this.contador = contador;
		this.numero = numero;
		this.sem = sem;
	}
	
	public void run() {
		System.out.println("Hilo "+ this.getName());
		try {
			sem.acquire();
			for (int i = 0; i < this.numero; i++) {
				Thread.sleep(100);
				contador.decrementa();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hilo en ejecución: "+this.getName() + " : " + this.contador.mostrarValor());
	}
}