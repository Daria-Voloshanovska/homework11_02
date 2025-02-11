public class Email implements MailDeliveryService {

    @Override
    public void sendMail() {
        System.out.println("Отправить по Интернету");
    }

    @Override
    public String getServiceName() {
        return "Email";
    }
}
