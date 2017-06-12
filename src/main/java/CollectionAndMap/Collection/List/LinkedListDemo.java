package CollectionAndMap.Collection.List;

import org.junit.Test;

import java.util.LinkedList;

/**
 * linkedList特有方法
 * Created by forever on 2017-6-11.
 */
public class LinkedListDemo {

    /**
     * 添加集合的首部,末尾
     */
    @Test
    public void testAddFirst() {
        LinkedList list = new LinkedList();
        list.addFirst("java01");
        list.addFirst("java02");
        list.addFirst("java03");
        list.addFirst("java04");
        System.out.println(list);
    }


    /***
     * 删除集合中的第一个和最后一个
     */
    @Test
    public void testRemoveFirst() {
        LinkedList list = new LinkedList();
        list.addFirst("java01");
        list.addFirst("java02");
        list.addFirst("java03");
        list.addFirst("java04");
        list.removeFirst();
    }


    /***
     * 删除集合中所有元素不要迭代
     */
    @Test
    public void testRemoveFirstAll() {
        LinkedList list = new LinkedList();
        list.addFirst("java01");
        list.addFirst("java02");
        list.addFirst("java03");
        list.addFirst("java04");
        while (!list.isEmpty())
            list.removeFirst();
    }

    /***
     * 如果集合为空 抛出异常
     */
    @Test
    public void testGetFirstAndPeekFirst() {
        LinkedList list = new LinkedList();
        list.addFirst("java01");
        list.addFirst("java02");
        list.addFirst("java03");
        list.addFirst("java04");
        while (true)
            list.removeFirst();

    }

    /**
     * 如果集合为空
     * 返回null
     */
    @Test
    public void testGetFirstAndPeekFirst1() {
        LinkedList list = new LinkedList();
        list.addFirst("java01");
        list.addFirst("java02");
        list.addFirst("java03");
        list.addFirst("java04");
        while (true)
            list.peekFirst();
    }


    /***
     * 移除并且 获取到元素
     * 为空抛出异常
     */
    @Test
    public void testRemove() {
        LinkedList list = new LinkedList();
        list.addFirst("java01");
        list.addFirst("java02");
        list.addFirst("java03");
        list.addFirst("java04");
        while (true)
            list.removeFirst();
    }

    /***
     * 移除并且 获取到元素
     * 为空 返回null
     */
    @Test
    public void testPoll() {
        LinkedList list = new LinkedList();
        list.addFirst("java01");
        list.addFirst("java02");
        list.addFirst("java03");
        list.addFirst("java04");
        while (true)
            list.pollFirst();
    }



}
