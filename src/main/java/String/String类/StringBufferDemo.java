package String.String类;

import org.junit.Test;

/**
 * Created by forever on 2017-6-6.
 */
public class StringBufferDemo {

    @Test
    public void test1() {
        StringBuffer stringBuffer = new StringBuffer();
    }

    /*****************************************添加操作*********************************/
    /**
     * 添加在末尾添加
     */
    @Test
    public void testAppend() {
        StringBuffer buffer = new StringBuffer();
        StringBuffer append = buffer.append("abc").append(123).append('c').append(new Object());
        System.out.println(append);//abc123cjava.lang.Object@22842dc7
    }


    /**
     * 添加在最前面
     */
    @Test
    public void testInsert() {
        StringBuffer buffer = new StringBuffer();
        StringBuffer append = buffer.insert(0, "aa").insert(0, "cc").insert(0, 33);
        System.out.println(append);//abc123cjava.lang.Object@22842dc7
    }

    /***
     * 插入的是字符串,可以设置插入字符串的部分
     * 参数3:起始角标从0开始
     * 参数4:截取的字符串总长度
     */
    @Test
    public void testInsert1() {
        StringBuffer buffer = new StringBuffer();
        StringBuffer append = buffer.insert(0, "aa").insert(0, "cc").insert(0, 33).insert(0, "abcdef", 2, 3);
        System.out.println(append);//abc123cjava.lang.Object@22842dc7
    }

    /********************************************删除*********************************/
    /***
     * delete 方法  删除的是当前容器的一个个字符
     * 参数1: 下标起始位置 包含
     * 参数2: 下标结束位置 不包含
     * 删除的长度是 参数2-参数1
     */
    @Test
    public void testDelete() {
        StringBuffer buffer = new StringBuffer();
        StringBuffer append = buffer.insert(0, "aa").insert(0, "cc").insert(0, 33).insert(0, "abcdef", 2, 3);//c33ccaa
        append.delete(2, 6);
        System.out.println(append);
    }

    /**
     * 删除某个位置的 某个字符
     *
     * 直接根据位置删
     */
    @Test
    public void testDeleteCharAt() {
        StringBuffer buffer = new StringBuffer();
        StringBuffer append = buffer.insert(0, "aa").insert(0, "cc").insert(0, 33).insert(0, "abcdef", 2, 3);//c33ccaa
        append.deleteCharAt(3);
        System.out.println(append);
    }

    /**
     * 想删除某个字符
     * 先查
     * 再删除
     *
     * 注意如果查不到,-1 就会报错
     */
    @Test
    public void testDeleteCharAt1() {
        StringBuffer buffer = new StringBuffer();
        StringBuffer append = buffer.insert(0, "aa").insert(0, "cc").insert(0, 33).insert(0, "abcdef", 2, 3);//c33ccaa
        append.deleteCharAt(append.indexOf("m"));
        System.out.println(append);
    }

    /***
     * 清空缓存区
     */
    @Test
    public void testDeleteAll() {
        StringBuffer buffer = new StringBuffer();
        StringBuffer append = buffer.insert(0, "aa").insert(0, "cc").insert(0, 33).insert(0, "abcdef", 2, 3);//c33ccaa
        append.deleteCharAt(3);
        /**
         * 方式1 :  stringBuffer.delete(0,stringBuffer.length());
         * 方式2: stringBuffer = new StringBuffer();
         * 用方式是1
         */
        append.delete(0, append.length());
        System.out.println(append);
    }

    /**
     * 替换字符串
     *
     */
    @Test
    public void testReplace() {
        StringBuffer  buffer = new StringBuffer("aabccdd");
        buffer.replace(2,5,"java");
        System.out.println(buffer);
    }


    /***
     * 替换某个位置的 字符
     * 参数1:要替换字符的位置
     * 参数2:替换后的字符
     */
    @Test
    public void testSetCharAt() {
        StringBuffer  buffer = new StringBuffer("aabccdd");
        buffer.setCharAt(3,'m');
        System.out.println(buffer);
    }


    /**
     * 反转
     */
    @Test
    public void testReverse() {

        String str = "addc";
        StringBuffer  buffer = new StringBuffer("aabccdd");
        buffer.reverse();
        System.out.println(buffer);
    }

    /****
     * 指定缓存区的字符 放到字符数组中
     * 参数1:源数据的 起始位置
     * 参数2:源数据的 结束位置
     * 参数3:目标字符数组
     * 参数4:从数组的起始位置坐标开始存放字符
     */
    @Test
    public void testGetChars() {
        StringBuffer  buffer = new StringBuffer("aabccdd");
        char[] chars = new char[3];
        buffer.getChars(2,5,chars,0);
    }
}
