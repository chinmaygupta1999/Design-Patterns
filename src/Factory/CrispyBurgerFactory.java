package Factory;

public class CrispyBurgerRestaurant extends BurgerRestaurantWithFactory{
//  override factory method
    public Burger createBurger(){
        return new CrispyBurger();
    }
}
