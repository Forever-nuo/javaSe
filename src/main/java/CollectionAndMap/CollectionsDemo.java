package CollectionAndMap;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Collections的方法
 * Created by forever on 2017-6-15.
 */
public class CollectionsDemo {


    @Test
    public void testShort() {

    }


    @Test
    public void testMax() throws ParseException {
        Set<Integer> numList = new HashSet<>();
        numList.add(1);
        numList.add(5);
        numList.add(3);

        numList.add(9);
        numList.add(7);
        numList.add(10);

        Integer max = Collections.max(numList);
        System.out.println(max);


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = dateFormat.parse("2015-12-3");
        Date date2 = dateFormat.parse("2015-12-8");
        Date date3 = dateFormat.parse("2015-12-5");
        List<Date> dateList = new ArrayList<>();
        dateList.add(date1);
        dateList.add(date2);
        dateList.add(date3);
        Date max1 = Collections.max(dateList);
        System.out.println(max1);


    }

    @Test
    public void testBinarySearch() {
    }

    @Test
    public void test() {

        Collections.reverseOrder();
    }

}
