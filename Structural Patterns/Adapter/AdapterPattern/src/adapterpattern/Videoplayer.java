/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;
public class Videoplayer implements MediaPlayer {
    @Override
    public void play(String filetype,String filename){
        if(filetype.equals("mp4") || filetype.equals("mp3")){
            System.out.println("Playing "+filetype+" file "+filename);
        }
        else{
            System.out.println("Invalid media "+ filetype + " format not supported");
        }
    }    
}
