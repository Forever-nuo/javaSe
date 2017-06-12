package CollectionAndMap.Collection.List;

import lombok.Data;
import org.junit.Test;

import java.util.*;

/**
 *
 * 本类 演示 list特有方法
 * Created by forever on 2017-6-8.
 */
public class ListDemo {


    @Test
    public void test() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        LinkedHashSet set = new LinkedHashSet(list);

        List<MyTree> trees = new ArrayList<>();
        MyTree tree1 = new MyTree();
        tree1.setId(4);
        tree1.setPid(44);
        MyTree tree2 = new MyTree();
        tree1.setId(5);
        tree1.setPid(55);
        MyTree tree3 = new MyTree();
        tree1.setId(44);
        tree1.setPid(444);
        MyTree tree4= new MyTree();
        tree1.setId(3);
        tree1.setPid(4);

    }

}

@Data
class MyTree{
    private int id;
    private int pid;
}