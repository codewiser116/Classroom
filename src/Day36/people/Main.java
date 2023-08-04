package Day36.people;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student b = new Student(); // upcasting
        Student student2 = new Student();
        Teacher a = new Teacher();
        Teacher teacher2 = new Teacher();

        ArrayList<Person> people = new ArrayList<>(
                Arrays.asList(b, student2, a, teacher2)
        );

        for (Person person : people) {
            person.person();
        }

    }
}
