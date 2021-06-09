
package factorymethod;
public class TransportFactory {
    public static Transport getTransport(String vechicle){
        if(vechicle.equals("BOAT")){
            return new Boat();
        }
        else if(vechicle.equals("TRUCK")){
            return new Truck();
        }
        return null;
    }
}
