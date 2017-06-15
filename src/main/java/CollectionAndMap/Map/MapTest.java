package CollectionAndMap.Map;

import org.junit.Test;

import java.util.*;

/**
 * map的常用方法
 * Created by forever on 2017-6-14.
 */
public class MapTest {


    /***
     * put方法 一对对的存放
     */
    @Test
    public void testPut() {
        Map<String, String> map = new HashMap<>();
        map.put("111", "222");
        map.put("1112", "2223");
        map.put("1113", "2224");
        map.put("1114", "2225");
        /**
         * key值唯一 后面的会覆盖前面的
         * put方法的返回值是 之前的value值 之前没有返回null
         */
        String put = map.put("1113", "2225");
        /***
         * 键值对可以存放null值
         */
        map.put(null, "2225");
        map.put("115", null);
        System.out.println(map);
    }

    /***
     *put all 把另外一个的map整个放入新的map中
     */
    @Test
    public void testPutAll() {
        Map<String, String> map = new HashMap<>();
        map.put("111", "222");
        map.put("1112", "2223");
        map.put("1113", "2224");
        map.put("1114", "2225");

        map.put("1113", "2225");

        map.put(null, "2225");
        map.put("115", null);

        Map<String, String> map1 = new HashMap<>();
        map.put("1114", "2225");
        map.put("1117", "2225");
        map1.putAll(map);
    }


    /***
     * get方法
     * 通过key  获得对应的value
     */
    @Test
    public void testGet() {
        Map<String, String> map = new HashMap<>();
        map.put("111", "222");
        map.put("1112", "2223");
        map.put("1113", "2224");
        map.put("1114", "2225");

        String put = map.put("1113", "2225");

        map.put(null, "2225");

        System.out.println(map.get("1113"));// 如果存在就会返回对应的 value值

        System.out.println(map.get(null));
        System.out.println(map.get("11116")); //如果不存在 就会返回null值
    }


    /**
     * containsKey(Object key)
     如果此映射包含指定键的映射，则返回 true
     */
    @Test
    public void testContainsKey() {
        Map<String, String> map = new HashMap<>();
        map.put("111", "222");
        map.put("1112", "2223");
        map.put("1113", "2224");
        map.put("1114", "2225");
        System.out.println(map.containsKey("111"));
        System.out.println( map.containsValue("222"));
    }

    /**
     * values()
     *返回此地图中包含的值的Collection视图。
     */
    @Test
    public void testValues() {
        Map<String, String> map = new HashMap<>();
        map.put("111", "222");
        map.put("1112", "2223");
        map.put("1113", "2224");
        map.put("1114", "2225");
        Collection<String> values = map.values();
    }

    /**
     *keySet方法获取到所有的key的set集合
     * 再通过遍历set集合
     * map.get(key) 获取到value
     */
    @Test
    public void testKeySet() {
        Map<String, String> map = new HashMap<>();
        map.put("111", "222");
        map.put("1112", "2223");
        map.put("1113", "2224");
        map.put("1114", "2225");

        map.put("1113", "2225");

        map.put(null, "2225");
        map.put("115", null);
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
    }


    /***
     * 通过entrySet 获取到对应的map映射关系集合
     * 再通过map.Entry的实体对象的 getKey方法获取key值
     * 通过getValue方法获取value值
     */
    @Test
    public void testEntrySet() {
        Map<String, String> map = new HashMap<>();
        map.put("111", "222");
        map.put("1112", "2223");
        map.put("1113", "2224");
        map.put("1114", "2225");

        map.put("1113", "2225");

        map.put(null, "2225");
        map.put("115", null);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }
    }

}
