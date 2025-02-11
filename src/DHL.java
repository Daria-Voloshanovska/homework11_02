public class DHL implements MailDeliveryService {

    @Override
    public void sendMail() {
        System.out.println("Положи письмо в конверт, поставь марку, отправь");
    }

    public String getServiceName() {
        return "DHL";
    }

}
