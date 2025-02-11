import java.util.*;


public class Main {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person("Jack", "Johnson", 32, "jackj@mail.com"));
        people.add(new Person("Celine", "Dion", 65, "celine@mail.com"));
        people.add(new Person("Bob", "Marvel", 19, "marvi@mail.com"));
        people.add(new Person("Dora", "Smith", 27, "dora@mail.com"));

        System.out.println("Список всех ФИО: ");
        for (Person person : people) {
            System.out.println(person.getFullName());
        }
        List<Person> emails = filterPersons(people, new PersonPredicateByEmail("mail.com"));
        System.out.println("Список всех email:");
        for (Person person : emails) {
            System.out.println(person.getEmail());
        }

    }

    public static List<Person> filterPersons(List<Person> persons, PersonPredicate predicate) {
        List<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (predicate.test(p)) {
                result.add(p);
            }
        }
        return result;
    }


}