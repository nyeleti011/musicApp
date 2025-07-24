package com.moodifyx;

import javax.sound.sampled.*;
import java.io.File;

puclic class SongPlayer {
    private static Clip clip;


    public static void play(String filePath){
        try{
            AudioInputStream audioStream = AudioStream.getAudioInputStream(new File(filePath));
            clip = AudionSystem.getClip();
            clip.open(audioStream);
            clip.start();
                }catch(Exception e){
                    System.out.println("Error Playing Sound: " + e.getMessage());
                }      
                  }
    }
public static void stop(){
    if(clip!=null && clip.isRunning()){
        clip.stop();
    }
}
