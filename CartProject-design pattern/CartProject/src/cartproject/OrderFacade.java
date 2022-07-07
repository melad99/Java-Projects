package cartproject;

public class OrderFacade {

    private OrderService orderService = new OrderServiceImpl();

    private EmailService emailService = new EmailServiceImpl();

    public void placeOrder() {

        orderService.createOrder();
        emailService.sendEmail();

    }
}
