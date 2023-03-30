package Java_Classes;
import javax.sound.sampled.AudioInputStream;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.spi.AudioFileReader;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import java.io.File;

public class player {
       public static void play(String fileLocation){
            try {

                File filepath = new File(fileLocation);
                if (filepath.exists()) {
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(filepath);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    JOptionPane.showMessageDialog(null, "Hit ok to pause ");
                    long clipTimePosition = clip.getMicrosecondPosition();
                    clip.stop();

                    JOptionPane.showMessageDialog(null,"Hit Ok to resume");
                    clip.setMicrosecondPosition(clipTimePosition);
                    clip.start();

                    JOptionPane.showMessageDialog(null,"Press Ok to stop Playing");
                } else {
                    System.out.println("cant Find file");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        String location = "new.wav";
        player p = new player();
        play(location);

    }

}
