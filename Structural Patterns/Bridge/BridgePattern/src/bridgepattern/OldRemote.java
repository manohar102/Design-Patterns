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
public class OldRemote implements Remote {

    @Override
    public String on() {
        return "ON with Old remote";
    }

    @Override
    public String off() {
        return "OFF with Old remote";
    }
    
}
