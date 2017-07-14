package Regular;

import org.testng.annotations.Test;

/**
 * Created by forever on 2017-7-12.
 */
public class StringRegular {
    /***
     * 匹配
     */
    @Test
    public void testMatches() {
        /**
         * 匹配
         * qq号 5-15位 第一个不能为0
         */
        String content = "9999955574a";
        String regex = "[1-9]\\d{4,14}";
        System.out.println(content.matches(regex));
    }


    /**
     * 切割字符串
     */
    @Test
    public void testSplit() {
        String content = "9999a95a5574a";
        String regex = "[a-z]";
        String[] split = content.split(regex);
        for (String s : split) {
            System.out.println(s);
        }
    }

    /***
     * 替换 去重为1次的
     * 特殊符号$
     */
    @Test
    public void testReplace() {
        String content = "9999a95a5574a";
        String regex = "(.)\\1+";
        String result = content.replaceAll(regex, "$1");
        System.out.println(result);
    }




}
