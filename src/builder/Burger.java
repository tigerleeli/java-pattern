package builder;

/**
 * 实现Item接口的抽象类，提供了默认的功能
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
