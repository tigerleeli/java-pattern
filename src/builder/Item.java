package builder;

/**
 * 食物条码的接口
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}