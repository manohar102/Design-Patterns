package abstactfactory;
public class FactoryProducer {
    public FurnitutureFactory getFactory(String age){
        if(age.contains("MODERN")){
            return new ModernFurnitureFactory();
        }
        else if(age.contains("VICTORIAL")){
            return new VictorialFunitureFactory();
        }
        return null;
    }   
}
