package CollectionAndMap.Map;

import org.junit.Test;

/**
 * Created by forever on 2017-6-24.
 */
public class PropertiesTest {


    /***
     * list方法 直接打印
     * 所有的键值对
     */
    @Test
    public void testList() {
        System.getProperties().list(System.out);
    }
}
