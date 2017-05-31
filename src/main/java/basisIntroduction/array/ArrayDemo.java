package basisIntroduction.array;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by forever on 2017-4-14.
 */
public class ArrayDemo {

    /**
     * 定义数组方式1: 数组元素中的数据类型 []  数组变量 = new 数组中元素的数据类型[数组的长度()元素的个数]
     * 示例:  int [] x = new int[3];
     * 该种方式定义数组 : 定义了一个长度为3的数组,数组中的每一个元素,都是元素类型的默认值(0)
     */
    @Test
    public void test() {
        int[] x = new int[3];
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    /**
     * 定义数组方式2:
     * 数组元素类型[] 数组变量 = new 数组元素类型[] {元素1,元素2,元素3};
     */
    @Test
    public void test1() {
        int x[] = new int[]{1, 2, 3};
        for (int i = 0; i < x.length; i++) {
            int y = x[i];
            System.out.println(y);
        }
    }

    /**
     * 定义数组方式3
     * 数组元素类型[] 数组变量 = {元素1,元素2,元素3};
     */
    @Test
    public void test2() {
        int[] x = {1, 2, 3};
        for (int i = 0; i < x.length; i++) {
            int y = x[i];
            System.out.println(y);
        }
    }

    /**
     * 使用数组中的元素
     * 和改变数组中的元素
     */
    @Test
    public void test4() {
        String[] str = {"12", "abc", "中国"};
        String str2 = str[1];
        str[1] = "ddd";
    }

    /**
     * 数组的角标越界
     */
    @Test
    public void testArrayIndexOutOfBounds() {
        int[] x = {1, 3, 5, 6};
        System.out.println(x[4]);
    }

    /**
     * 数组的空指针异常
     */
    @Test
    public void testArrayNullPointer() {
        int[] x = new int[5];
        x = null;
        System.out.println(x[3]);
    }

    /**
     * 遍历数组
     */
    @Test
    public void testIterateArray() {
        int[] x = {1, 3, 5, 7};
        /**
         * 一般for循环
         */
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        /**
         * foreach循环
         */
        for (int i : new int[]{333, 223, 555}) {
            System.out.println(i);
        }
    }

    /**
     * 数组的长度 length属性
     */
    @Test
    public void testArrayLength() {
        int[] x = {1, 3, 5, 6, 8, 9};
        int[] y = {2, 3, 5, 4};
        System.out.println(x.length);
        System.out.println(y.length);
        int[] x1 = new int[]{1, 2, 3, 4};
        int[] add = ArrayUtils.add(x1, 5);
        for (int i : add) {
            System.out.println(i);
        }
    }

    /**
     * 求数组中的最值
     */
    @Test
    public void testGetMax() {
        int[] x = {2, 3, 9, 4, 77, 55};
        int max = x[0];    //定义一个变量 接受最大值 先默认数组中的任意一元素为最大值
        for (int i = 1; i < x.length; i++) { //遍历数组 和变量最大值比较
            max = x[i] > max ? x[i] : max; //如果大 最大值就替换掉 不大还是原来的最大值
        }
        System.out.println(max);
    }

    /**
     * 先排好序 再获取角标第一个元素或最后一个元素
     */
    @Test
    public void testGetMax2() {
        int[] x = {2, 3, 9, 4, 77, 55};
        Arrays.sort(x);
        System.out.println(x[x.length - 1]);
    }

    /**
     * 选择排序
     */
    @Test
    public void testSort1() {
        int[] x = {4, 3, 2, 4, 77, 55, 2};
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.println(x);
    }

    /**
     * 冒泡排序
     */
    @Test
    public void testSort2() {
        int[] x = {4, 3, 2, 4, 77, 55, 2};
        for (int i = 1; i < x.length; i++) {
            for (int j = 0; j < x.length - i; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        System.out.println(x);
    }

    /**
     * 顺序查找
     */
    @Test
    public void testSearch() {
        int[] x = {4, 3, 2, 4, 77, 55, 2};
        int key = 2;
        int indexBykey = getIndexByKey3(x, key);

    }

    /**
     * 顺序查找
     * 获得一个元素在数组中第一次出现的角标位置
     *
     * @param arr
     * @param key
     * @return
     */
    public int getIndexByKey1(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    /**
     * 折半查找
     * 获得一个元素在数组中第一次出现的角标位置
     *
     * @param arr
     * @param key
     * @return
     */
    public int getIndexByKey2(int[] arr, int key) {
        Arrays.sort(arr);
        int min = 0;
        int max = arr.length - 1;
        for (int mid = (min + max) / 2; min <= max; mid = (min + max) / 2) {
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                min = mid + 1;
            else
                max = mid - 1;
        }
        return -1;
    }

    public int getIndexByKey3(int[] arr, int key) {
        Arrays.sort(arr);
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;
        while (arr[mid] != key) {
            if (key > arr[mid]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (min > max) {
                return -1;
            }
            mid = (min + max) / 2;
        }
        return mid;
    }

    /***
     * 十进制 转成2进制
     *
     * @param x
     * @return
     */
    public String getBIn(int x) {
        StringBuilder builder = new StringBuilder();
        for (; x > 0; x = x / 2) {
            builder.append(x % 2);
        }
        return builder.reverse().toString();
    }

    @Test
    public void testGetBIn() {
        System.out.println(getBIn(5));
    }

    /***
     * 查表法
     */
    @Test
    public void testSearchTable() {
        int x = 60;
        char []arr = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuilder builder = new StringBuilder();
        for (; x !=0;x= x>>>4 ) {
            int temp = x & 15;
            builder.append(arr[temp]);
        }
        System.out.println(builder.reverse().toString());
    }
}

