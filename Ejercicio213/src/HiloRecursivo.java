public class HiloRecursivo extends Thread{
    
    private static int veces; 
    private static boolean flag = false;
    private static int siguiente;
    
    public HiloRecursivo() {
        if(!flag) {
            this.veces = 10;
            flag = true;
        }else {
        	//Numero de hilos que faltan por crear
            this.veces=siguiente;
        }        
    }
    public void run() {
        if(veces > 0) {
            this.setName("Hilo " + veces);
            this.siguiente = veces - 1;
            System.out.println("Soy el " + getName() +": y voy a llamar al hilo " + siguiente);            
            HiloRecursivo hilo = new HiloRecursivo();
            hilo.start();
        }else if(veces == 0) {
            this.setName("Hilo " + veces);
            System.out.println("Soy el " + getName());
        }
    }
    
}