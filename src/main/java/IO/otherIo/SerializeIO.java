package IO.otherIo;



import org.junit.Test;

import java.io.*;

/**
 * Created by forever on 2017-6-28.
 */
public class SerializeIO {


    @Test
    public void testWriteObject() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("H:\\testFile\\person.object"));
        oos.writeObject(new Person(35,"张三"));
        oos.close();
    }

    @Test
    public void testReadObj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("H:\\testFile\\person.object"));
        Person person = (Person) ois.readObject();
        System.out.println(person);


    }
}
