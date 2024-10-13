public class ShippingService {
    public double calculateShipping(String shippingAddress) {
        System.out.println(shippingAddress);
        return 990;
    }

    public void shipOrder(String productName, String shippingAddress){
        System.out.println(productName + " has been shipped to " + shippingAddress);
    }
}
