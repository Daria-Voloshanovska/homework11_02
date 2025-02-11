import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();

        MailDeliveryService[] services = {
                new DHL(),
                new Email(),
                new Pigeon()
        };

        MailDeliveryService selectedService = selectService(services, scanner);

        sender.send(selectedService);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jack", "Johnson", 32, "jackj@mail.com"));
        people.add(new Person("Celine", "Dion", 65, "celine@mail.com"));
        people.add(new Person("Bob", "Marvel", 19, "marvi@mail.com"));
        people.add(new Person("Dora", "Smith", 27, "dora@mail.com"));

        System.out.println("Список всех ФИО: " + System.lineSeparator());
        for (Person person : people) {
            System.out.println(person.getFullName());
        }
        System.out.println("Список всех email: " + System.lineSeparator());
        for (Person person : people) {
            System.out.println(person.getInfo());
        }

    }

    public static MailDeliveryService selectService(MailDeliveryService[] services, Scanner scanner) {
        System.out.println("Выберите способ отправки почты: ");
        for (int i = 0; i < services.length; i++) {
            System.out.printf("%d. %s ", i + 1, services[i].getServiceName());
        }
        int select = scanner.nextInt() - 1;
        return services[select];
    }
}