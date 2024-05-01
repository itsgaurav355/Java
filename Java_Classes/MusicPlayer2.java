package com.Java_Classes;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class MusicPlayer2 {
    public void play(String fileLocation)
    {
        try {

            File filepath = new File(fileLocation);
            System.out.println(filepath.toString());
            if (filepath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(filepath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                System.out.println("Playing Music");
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                JOptionPane.showMessageDialog(null, "Hit ok to pause ");
                long clipTimePosition = clip.getMicrosecondPosition();
                clip.stop();


                JOptionPane.showMessageDialog(null,"Hit Ok to resume");
                clip.setMicrosecondPosition(clipTimePosition);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);

                JOptionPane.showMessageDialog(null,"Press Ok to stop Playing");
                System.out.println("Thanks For using this App");
            } else {
                System.out.println("cant Find file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the File Location");
        String location ;
        location=sc.nextLine();
        MusicPlayer2 mp = new MusicPlayer2();
        mp.play(location);
    }
}
