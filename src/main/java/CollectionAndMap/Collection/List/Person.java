package CollectionAndMap.Collection.List;

import lombok.Data;

/**
 * Created by forever on 2017-6-8.
 */

@Data
public class Person {

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name ;
    private int age;

}
