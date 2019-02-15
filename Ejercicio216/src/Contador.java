
public class Contador {
	private int cont;
	
	public Contador(int cont) {
		this.cont = cont;
	}
	
	public void incrementa() {
		cont++;
	}
	
	public void decrementa() {
		cont--;
	}
	
	public void mostrarValor() {
		System.out.println(cont);
	}
}
