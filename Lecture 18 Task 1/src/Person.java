public class Person {
    private final String firs_name;
    private final String last_name;
    private final int age;
    private final String email;

    public Person(String firsName, String lastName, int age, String email) {
        firs_name = firsName;
        last_name = lastName;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person:" +
                " firs_name = '" + firs_name + '\'' +
                ", last_name = '" + last_name + '\'' +
                ", age = " + age +
                ", email = '" + email + '\'' +
                '}';
    }
}