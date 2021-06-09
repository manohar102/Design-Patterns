/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author Manohar Krishna
 */
public class AudioAdapter implements MediaPlayer{
    
    AdvancedMediaPlayer advancedMediaPlayer;
    
    public AudioAdapter(String filetype){
        if(filetype.equals("vlc")){
            advancedMediaPlayer = new VlcMediaPlayer();
        }
        else if(filetype.equals("mp4")){
            advancedMediaPlayer = new Mp4MediaPlayer();
        }
    }

    @Override
    public void play(String filetype, String filename) {
        if(filetype.equals("mp4")){
            advancedMediaPlayer.playMp4(filename);
        }
        else if(filetype.equals("vlc")){
            advancedMediaPlayer.playVlc(filename);
        }  
    }
}
