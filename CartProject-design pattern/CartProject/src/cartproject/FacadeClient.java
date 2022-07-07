package cartproject;

public class FacadeClient {

    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        System.out.println("Output with facade");
        orderFacade.placeOrder();

        //Achieveing the above functionality without facade
        OrderService orderService = new OrderServiceImpl();
        EmailService emailService = new EmailServiceImpl();

        System.out.println("Output without facade");
        orderService.createOrder();
        emailService.sendEmail();

    }
}
