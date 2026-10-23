            paymentService = new CreditCardPaymentService();
        } else if (paymentType.equals("UPI")) {
            paymentService = new UPIPaymentService();
        } else if (paymentType.equals("WALLET")) {
            paymentService = new WalletPaymentService();
        } else if (paymentType.equals("NET_BANKING")) {
            paymentService = new NetBankingPaymentService();
        } else if (paymentType.equals("COD")) {
            paymentService = new CashOnDeliveryPaymentService();
        } else {
            throw new RuntimeException("Invalid payment type");
        }

        OrderService orderService = new OrderService(paymentService);
        orderService.placeOrder();
    }
}
