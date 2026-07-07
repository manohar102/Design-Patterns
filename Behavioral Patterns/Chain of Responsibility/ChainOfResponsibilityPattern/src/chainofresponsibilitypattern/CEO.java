package chainofresponsibilitypattern;

public class CEO extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("CEO approved Purchase Request #" + request.getNumber() 
            + " for $" + String.format("%.2f", request.getAmount()) 
            + " (Purpose: " + request.getPurpose() + ")");
    }
}
