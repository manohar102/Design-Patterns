
package factorymethod;

/**
 *
 * @author Manohar Krishna
 */
public class Boat implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver via sea");
    }
}
