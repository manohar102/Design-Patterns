package proxypattern;

public class ProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo_highres_1.png");
        Image image2 = new ProxyImage("photo_highres_2.png");

        System.out.println("--- Images instantiated (no disk loading yet) ---");
        
        System.out.println("\n--- Accessing image1 (1st time: triggers load) ---");
        image1.display();
        
        System.out.println("\n--- Accessing image1 (2nd time: no load, cached) ---");
        image1.display();
        
        System.out.println("\n--- Accessing image2 (1st time: triggers load) ---");
        image2.display();
    }
}
