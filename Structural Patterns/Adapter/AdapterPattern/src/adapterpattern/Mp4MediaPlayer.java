
package adapterpattern;

/**
 *
 * @author Manohar Krishna
 */
public class Mp4MediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing Mp4 file: " + filename);
    }

}
