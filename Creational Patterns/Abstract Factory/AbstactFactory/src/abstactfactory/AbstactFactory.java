package abstactfactory;
public class AbstactFactory {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();
        FurnitutureFactory modernFac = producer.getFactory("MODERN");
        Chair mChair = modernFac.createChair();
        mChair.type();
        Sofa mSofa = modernFac.createSofa();
        mSofa.type();
        
        FurnitutureFactory victorialFac = producer.getFactory("VICTORIAL");
        Chair vChair = victorialFac.createChair();
        vChair.type();
        Sofa vSofa = victorialFac.createSofa();   
        vSofa.type();
    }
}
