package CollectionAndMap.Map;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by forever on 2017-6-15.
 */
public class MapUse  {


    /***
     * "字符串"adwedwewerfdsdw" 每个字母出现的次数
     */

    public int getCharTimes(String str, char c) {

        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            Integer times = map.get(aChar);
            times = times == null ? 0 : times;
            map.put(aChar, ++times);
        }
        Integer times = map.get(c);
        return  times == null ? 0 : times;
    }


    @Test
    public void testGetCharTimes() {
        int charTimes = getCharTimes("adwedwewerfdsdw", 'w');
        System.out.println(charTimes );
    }


}
