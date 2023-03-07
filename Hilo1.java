public class Hilo1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ": Programacion Con ");

            try {
                Hilo1.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo1 " + e);
            }
        }
    }
}
