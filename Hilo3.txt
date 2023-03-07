import java.io.File;
import java.io.*;
import java.util.*;
import java.applet.AudioClip;
import java.util.Scanner;

public class Hilo3 extends Thread{

    @Override
    public void run() {
            
            try {
                Hilo3.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo3 " + e);
            }
            
            Scanner hilo3 = new Scanner(System.in);
            AudioClip Sound;
            Sound = java.applet.Applet.newAudioClip(getClass().getResource("/musica.wav"));
            Sound.play();
            
          
          
        
    }
}
