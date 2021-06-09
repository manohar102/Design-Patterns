/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Manohar Krishna
 */
public class Boat implements Transport {
    @Override
    public void deliver(){
        System.out.println("Deliver via sea");
    }
}
