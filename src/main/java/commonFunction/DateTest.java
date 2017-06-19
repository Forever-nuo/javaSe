package commonFunction;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by forever on 2017-6-19.
 */
public class DateTest {

    @Test
    public void testDate() {
        Date date = new Date();
        System.out.println(date); //Mon Jun 19 23:14:12 CST 2017
    }


    /**
     *  日期格式化
     */
    @Test
    public void testDateFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String time = dateFormat.format(new Date());
        System.out.println(time);
    }
}
