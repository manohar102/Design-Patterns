/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstactfactory;

/**
 *
 * @author Manohar Krishna
 */
public class VictorialFunitureFactory implements FurnitutureFactory {
    @Override
    public Chair createChair(){
        return new VictorialChair();
    }
    @Override
    public Sofa createSofa(){
        return new VictorialSofa();
    }
}
