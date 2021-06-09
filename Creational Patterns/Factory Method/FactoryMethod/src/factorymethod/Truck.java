
package factorymethod;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver via road");
    }
    
}
