package chainofresponsibilitypattern;

public class Manager extends Approver {
    private static final double ALLOWABLE = 500.0;

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= ALLOWABLE) {
            System.out.println("Manager approved Purchase Request #" + request.getNumber() 
                + " for $" + String.format("%.2f", request.getAmount()) 
                + " (Purpose: " + request.getPurpose() + ")");
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
