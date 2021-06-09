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
public abstract class TV {
    Remote remote;
    TV(Remote remote){
        this.remote = remote;
    }
    
    abstract void on();
    abstract void off();
}
