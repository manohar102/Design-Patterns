package factorymethod;
public class FactoryMethod {
    public static void main(String[] args) {
        Transport vechicle = TransportFactory.getTransport("BOAT");
        vechicle.deliver();
        Transport vechicle2 = TransportFactory.getTransport("TRUCK");
        vechicle2.deliver();
    }
}