public class Hilo2 extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hilos y una Cancion ");
            
            try {
                Hilo2.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo2 " + e);
            }
        }
    }

}