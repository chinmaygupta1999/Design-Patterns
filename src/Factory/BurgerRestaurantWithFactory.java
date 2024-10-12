package Factory;


public abstract class BurgerFactory {
//  orderBurger stays same for any burger in the menu, no need of modification
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

//  Factory Method
    public abstract Burger createBurger();
}
