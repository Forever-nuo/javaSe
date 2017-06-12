package CollectionAndMap.Collection.List;

import java.util.LinkedList;

/**
 * Created by forever on 2017-6-11.
 */
public class DuiLie {
    private LinkedList linked ;

    public DuiLie() {
        linked= new LinkedList();
    }

    /***
     * 添加元素
     */
    void addElement(Object object) {
        linked.addLast(object);
    }

    /**
     * 获得元素
     * @return
     */
    boolean isEmpty() {
        return linked.isEmpty();
    }

    /***
     * 获取元素
     */
    Object getElement() {
      return linked.removeFirst();
    }

    public static void main(String[] args) {
        DuiLie duiLie = new DuiLie();
        duiLie.addElement("object1");
        duiLie.addElement("object2");
        duiLie.addElement("object3");
        duiLie.addElement("object4");
        duiLie.addElement("object5");
        while (!duiLie.isEmpty())
            System.out.println(duiLie.getElement());
    }
}
