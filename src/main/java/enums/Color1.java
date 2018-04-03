package enums;

import lombok.Data;

/**
 *
 * 自定义方法: 最后一个具体枚举实例 要 ; 号
 *
 * 可以有构造函数
 *
 * @author Forever丶诺
 * @date 2018/4/3 16:01
 */

public enum Color1 {
    RED(1, "红色" ), BLUE, YELLO;
    private String desc;
    private int type;

    Color1(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    Color1() {

    }

    /**
     * set get  方法
     * @return
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void otherFun(){
        System.out.println("其他方法");
    }

    public static void staticFun(){
        System.out.println("静态方法");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
