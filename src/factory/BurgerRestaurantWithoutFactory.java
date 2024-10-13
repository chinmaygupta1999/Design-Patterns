package Factory;

public class RestaurantWithoutFactory {
    public Burger orderBurger (String request) {
        Burger burger = null;
        switch (request) {
            case "Crispy" -> {
                burger = new CrispyBurger();
            }
            case "Veggie" -> {
                burger = new VeggieBurger();
            }
            case "Paneer" -> {
                burger = new PaneerBurger();
            }
        }
        assert burger != null;
        burger.prepare();
        return burger;
    }
}
