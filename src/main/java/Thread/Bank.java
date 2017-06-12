package Thread;

/**
 * Created by forever on 2017-6-4.
 */
public class Bank {
    private int sum ;
   synchronized void add(int n){
        sum = sum + n;
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("总金额:"+sum);
    }
}
