/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
