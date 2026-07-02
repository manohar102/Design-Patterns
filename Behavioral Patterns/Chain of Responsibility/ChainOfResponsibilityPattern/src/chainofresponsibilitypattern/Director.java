package chainofresponsibilitypattern;

public class Director extends Approver {
    private static final double ALLOWABLE = 5000.0;

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= ALLOWABLE) {
            System.out.println("Director approved Purchase Request #" + request.getNumber() 
                + " for $" + String.format("%.2f", request.getAmount()) 
                + " (Purpose: " + request.getPurpose() + ")");
        } else if (successor != null) {
            System.out.println("Purchase Request #" + request.getNumber() + " requires CFO approval...");
            successor.processRequest(request);
        }
    }
}
