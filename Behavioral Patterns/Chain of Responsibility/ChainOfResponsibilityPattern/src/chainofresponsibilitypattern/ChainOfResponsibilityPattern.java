package chainofresponsibilitypattern;

public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        // Create handlers
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        // Establish the chain
        manager.setSuccessor(director);
        director.setSuccessor(ceo);

        // Send purchase requests
        System.out.println("--- Submitting Request 1 ---");
        PurchaseRequest req1 = new PurchaseRequest(1, 350.00, "Office Supplies");
        manager.processRequest(req1);

        System.out.println("\n--- Submitting Request 2 ---");
        PurchaseRequest req2 = new PurchaseRequest(2, 2500.00, "Laptops for Team");
        manager.processRequest(req2);

        System.out.println("\n--- Submitting Request 3 ---");
        PurchaseRequest req3 = new PurchaseRequest(3, 12000.00, "Enterprise Software Licenses");
        manager.processRequest(req3);
    }
}
