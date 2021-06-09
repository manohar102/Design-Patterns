/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern;

/**
 *
 * @author Manohar Krishna
 */
public class Samsung extends TV {
    Remote remote;
    Samsung(Remote remote){
        super(remote);
        this.remote = remote;
    }
    @Override
    void on() {
        System.out.println("Samsung TV ON: "+ remote.on());
    }

    @Override
    void off() {
        System.out.println("Samsung TV OFF :"+ remote.off());
    }    
}
