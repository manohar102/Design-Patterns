package abstactfactory;

/**
 *
 * @author Manohar Krishna
 */
public class ModernFurnitureFactory implements FurnitutureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModeranSOfa();
    }

}
