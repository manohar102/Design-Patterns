package abstactfactory;

/**
 *
 * @author Manohar Krishna
 */
public class VictorialFunitureFactory implements FurnitutureFactory {
    @Override
    public Chair createChair() {
        return new VictorialChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorialSofa();
    }
}
