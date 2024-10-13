public class ShoppingFacade {

    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        this.productCatalog = new ProductCatalog();
        this.paymentProcessor = new PaymentProcessor();
        this.inventoryManager = new InventoryManager();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String productName, String shippingAddress, String cardInfo) {
        System.out.println("Placing order: ");

        System.out.println(productCatalog.searchProduct(productName));

        if(!inventoryManager.checkInventory(productName)){
            System.out.println("Product is out of stock!");
            return;
        }

        if (!paymentProcessor.processPayment(cardInfo)) {
            System.out.println("Payment failed");
            return;
        }

        double shippingCost = shippingService.calculateShipping(productName);
        System.out.println("Shipping cost: " + shippingCost + "₸");
        shippingService.shipOrder(productName, shippingAddress);

        System.out.println("Order placed successfully for: " + productName);
    }
}
