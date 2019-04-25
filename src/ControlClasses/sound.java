/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlClasses;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author omar waheed
 */
public class sound {
    File f ;
   public sound(){}
    
    
    
    
    
    public void PlaySound(){
         f =new File("1.wav");
        try {
            Clip c=AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(f));
            c.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println("Eror in Sound  "+e);
        }
    
    }
    public void EmpAddedSuccessfully(){
       f =new File("emp was added successfully.wav");
        try {
            Clip c=AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(f));
            c.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println("Eror in Sound  "+e);
        }
    
    }
     public void RetrivingData(){
       f =new File("Retriving Data.wav");
        try {
            Clip c=AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(f));
            c.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println("Eror in Sound  "+e);
        }
    
    }
    
}

