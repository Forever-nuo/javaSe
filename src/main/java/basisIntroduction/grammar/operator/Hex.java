package basisIntroduction.grammar.operator;

/**
 * Created by forever on 2017-4-10.
 */
public class Hex {

    public static String getHex(int a) {
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 8; i++) {
            int temp = a & 15;//15的2进制 1111
            if (temp != 0)
                buffer.insert(0, chars[temp]);
            a = a >>> 4;
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(Integer.toHexString(-75));
        System.out.println(getHex(-75));
    }
}
