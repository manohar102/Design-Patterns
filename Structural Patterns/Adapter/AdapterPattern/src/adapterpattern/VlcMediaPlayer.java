package adapterpattern;

/**
 *
 * @author Manohar Krishna
 */
public class VlcMediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.println(" Vlc is playing " + filename);
    }

    @Override
    public void playMp4(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}
