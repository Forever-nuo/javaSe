package ObjectToObject.functionOverride.demo1;

/**
 * Created by forever on 2017-4-21.
 */
public class Phone2 extends Phone1 {
    @Override
    public void show() {
        System.out.println("显示姓名");
        super.show();
    }
}
