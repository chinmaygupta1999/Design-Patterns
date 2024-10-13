package Factory;

public class PaneerBurgerRestaurant extends BurgerRestaurantWithFactory{
    public Burger createBurger(){
        return new PaneerBurger();
    }
}
