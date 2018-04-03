package enums;

/**
 * @author Forever丶诺
 * @date 2018/4/3 16:20
 */
public interface Food {
    enum  Office implements  Food{
        BLACK_COFFEE,DECAF_COFFEE,LATTE
    }
    enum Dessert implements Food{
        FRUIT, CAKE, GELATO
    }
}
