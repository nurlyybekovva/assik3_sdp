public class Main {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        String productName = "charger";
        String cardInfo = "1234123412341234";
        String shippingAddress = "Mangilik el C1";
        shoppingFacade.placeOrder(productName, shippingAddress, cardInfo);
    }
}