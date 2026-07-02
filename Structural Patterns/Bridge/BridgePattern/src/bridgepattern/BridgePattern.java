
package bridgepattern;

public class BridgePattern {
    public static void main(String[] args) {
        // TODO code application logic here
        TV realmeOldremote = new RealMe(new OldRemote());
        realmeOldremote.on();
        realmeOldremote.off();

        TV realmeNewremote = new RealMe(new NewRemote());
        realmeNewremote.on();
        realmeNewremote.off();

        TV samsungeOldremote = new Samsung(new OldRemote());
        samsungeOldremote.on();
        samsungeOldremote.off();

        TV samsungeNewremote = new Samsung(new NewRemote());
        samsungeNewremote.on();
        samsungeNewremote.off();
    }
}
