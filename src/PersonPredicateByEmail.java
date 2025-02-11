public class PersonPredicateByEmail implements PersonPredicate {
    private String domain;

    public PersonPredicateByEmail(String domain) {
        this.domain = domain;
    }

    @Override
    public boolean test(Person person) {
        return person.getEmail().contains(domain);
    }
}
