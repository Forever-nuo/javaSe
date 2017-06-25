package commonFunction;


import lombok.Data;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
     * 日期格式化
     */
    @Test
    public void testDateFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String time = dateFormat.format(new Date());
        System.out.println(time);
    }


    /***
     * 获取日期的年份
     */
    @Test
    public void testFormatYear() {
        /***
         * 格式化多少部分就返回多少部分
         */
        String year = new SimpleDateFormat("yyyy").format(new Date());
        System.out.println(year);
    }

    /***
     * 方式2
     * 获取日期中的年份
     */
    @Test
    public void testCalendar() {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
    }


    /***
     * 设置时间
     */
    @Test
    public void testSet() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2012, 11, 26);
        printDate(calendar);

    }


    void printDate(Calendar calendar) {
        Map weekmap = new HashMap();
        weekmap.put(1, "星期日");
        weekmap.put(2, "星期一");
        weekmap.put(3, "星期二");
        weekmap.put(4, "星期三");
        weekmap.put(5, "星期四");
        weekmap.put(6, "星期五");
        weekmap.put(7, "星期六");

        System.out.println(calendar.get(Calendar.YEAR)+"年");
        System.out.println((calendar.get(Calendar.MONTH) + 1)+"月"); // 0 表示1月  11 表示12
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+"日");
        System.out.println(weekmap.get(calendar.get(Calendar.DAY_OF_WEEK)));//1 表示星期日  7 表示星期六

    }


    @Test
    public void testAdd() {
        Calendar calendar = Calendar.getInstance();
        /***
         * 参数1: 偏移的字段  年 月 天
         * 参数2: 正数  往后偏移  负数 往前偏移
         */
        calendar.add(Calendar.YEAR,2);
        printDate(calendar);
    }

    /****
     * 获得某年 某2月份的 天数
     *
     * 获取到3月1号
     * 再往前偏移一天
     *
     */
    @Test
    public void test() {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2017, 2, 1);
        calendar1.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));
    }


    /***
     * 字符串格式的日期  转成日期对象
     * @throws ParseException
     */
    @Test
    public void testStringToDate() throws ParseException {
        DateFormat dateFormat =  new SimpleDateFormat("yyyy年MM月dd日");

        Date parse = dateFormat.parse("2014年5月25日");
    }
}
