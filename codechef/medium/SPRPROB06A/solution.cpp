public class Main {
    public static void main(String[] args) {

        PaymentServiceInterface payment = new PayPalPaymentService();
        OrderService orderService = new OrderService(payment);

        orderService.placeOrder();
    }
}
