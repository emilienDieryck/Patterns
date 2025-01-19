public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Paiement avec carte de crédit
        PaymentStrategy creditCardPayment = new CreditCardPayment("John Doe", "1234-5678-9012-3456", "123", "12/25");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);  // 100 € payés avec une carte de crédit.

        // Paiement avec PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);  // 50 € payés avec PayPal.

        // Paiement avec Bitcoin
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        cart.setPaymentStrategy(bitcoinPayment);
        cart.checkout(75);  // 75 € payés avec Bitcoin.
    }
}