public class PersonPredicateByFullName implements PersonPredicate {
    private String fullName;

    public PersonPredicateByFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean test(Person person) {
        return person.getFullName().equalsIgnoreCase(fullName);
    }
}
