
package adapterpattern;

/**
 *
 * @author Manohar Krishna
 */
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String filetype, String filename) {
        if (filetype.equals("mp3")) {
            System.out.println("Playing mp3 file: " + filename);
        } else {
            // MediaPlayer vp = new Videoplayer();
            // vp.play(filetype,filename);
            MediaPlayer mediaAdapter = new AudioAdapter(filetype);
            mediaAdapter.play(filetype, filename);
        }
    }
}
