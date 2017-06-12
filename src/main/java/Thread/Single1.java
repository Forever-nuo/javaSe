package Thread;

/**
 * Created by forever on 2017-6-4.
 */
public class Single1 {
    private static Single1 single1 =null;

    private Single1() {
    }

    public static Single1 getSingle1() {
        synchronized (Single1.class) {
            if (single1 == null) {
                return single1 = new Single1();
            }
        }
        return single1;
    }


}
