package CollectionAndMap.Collection.Set;

import lombok.Data;

import java.util.Objects;

/**
 * Created by forever on 2017-6-12.
 */
@Data
public class Person implements  Comparable {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("调用equals方法");
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        if (age != person.age) return false;
        return !(name != null ? !name.equals(person.name) : person.name != null);

    }

    @Override
    public int hashCode() {
        System.out.println("调用hashcode方法");
        return name.hashCode()+age;
    }

    @Override
    public int compareTo(Object o) {
        int i = this.age - ((Person) o).getAge();
        System.out.println(i  );
        return i;
    }
}
