package adapterpattern;
public class AdapterPattern {
    public static void main(String[] args) {
        MediaPlayer ap = new AudioPlayer();
        ap.play("mp3", "mano.mp3");
        ap.play("mp4", "manp.mp4"); // Adapter need to use to play mp4 format using the Mp4MeidaPlayer
        ap.play("vlc", "mano.vlc"); // Adapter need to use to play vlc format using the VlcMediaPlayer
        
        MediaPlayer vp = new Videoplayer();
        vp.play("mp4", "mano.mp4");
        vp.play("mp3","mp3");
        vp.play("vlc","kanula.vlc");
    }
}
