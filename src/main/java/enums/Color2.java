package enums;

/**
 * @author Forever丶诺
 * @date 2018/4/3 16:17
 */
public enum Color2 implements EnumInterface {

    RED, BLUE, YELLOW;



    @Override
    public void sayFun() {
        System.out.println("实现接口的方法" );
    }
}
