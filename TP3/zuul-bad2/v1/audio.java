package v1;
import java.util.AudioSystem;
public class audio {
    public static synchronized void playSound(final String url){
        new Thread(new Runnable(){
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream (Main.class.getRessourceAsStream("/path/to/sounds/" + url));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }
}