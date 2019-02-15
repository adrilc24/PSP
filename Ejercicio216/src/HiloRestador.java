
public class HiloRestador extends Thread{
	
	private String nombre;
	private int num;
	private Contador cont;
	
	public HiloRestador (String nombre,int num, Contador cont) {
		this.nombre = nombre;
		this.num = num;
		this.cont = cont;
	}
	
	public void run() {
		
		try {
			cont.mostrarValor();
			for (int i = 0; i < num; i++) {
				cont.decrementa();
				sleep(100);
			}
			System.out.printf("\nNombre Hilo: "+nombre+" Nº Vueltas: "+num+" Valor final: \n");
			cont.mostrarValor();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
