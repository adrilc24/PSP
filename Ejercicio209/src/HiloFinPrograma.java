
public class HiloFinPrograma extends Thread {
	public String parametro;
	public int repeticion;
	public HiloFinPrograma(String parametro, int repeticion) {
		super(parametro);
		this.repeticion = repeticion;
	}
	public void run() {
		for(int i = 1; i <= this.repeticion; i++) {
			System.out.println(" Nombre del hilo: " +Thread.currentThread().getName()+ " ->  iteración: " + i);
		}
	}
}
