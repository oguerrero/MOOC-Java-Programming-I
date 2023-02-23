
import java.util.Objects;

public class Person {

    private final String name;
    private final SimpleDate birthday;
    private final int height;
    private final int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Person)) {
            return false;
        }

        // convert the object into a Person object
        Person comparedPerson = (Person) compared;

        // if the values of the object variables are the same, the objects are equal
        return this.name.equals(comparedPerson.name)
                && this.birthday.equals(comparedPerson.birthday)
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight;

        // otherwise the objects are not equal
    }
}
