package Regular;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by forever on 2017-7-13.
 */
public class MatchPattern {

    @Test
    public void test() {
        /****
         * 将规则封装成对象
         */
        Pattern pattern = Pattern.compile("\\b[a-z]{3}\\b");
        String content = "mamewe dd jweew  java bbc ee kkk  cc  kkw";

        /**
         * 匹配返回匹配器
         */
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            String str = matcher.group();
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(str+"..........."+start+"-----");
        }

    }
}
