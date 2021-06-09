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
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String filetype, String filename){
        if(filetype.equals("mp3")){
            System.out.println("Playing mp3 file: "+filename);
        }
        else{
//            MediaPlayer vp = new Videoplayer();
//            vp.play(filetype,filename);
              MediaPlayer mediaAdapter = new AudioAdapter(filetype);
              mediaAdapter.play(filetype,filename);
        }
    }
}
