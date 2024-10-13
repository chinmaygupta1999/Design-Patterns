package Builder;

public class PaneerBurgerBuilder extends Builder{
    Integer id;
    String bun;
    String cheese;
    String sauce;
    String patty = "Paneer";
    String weight;
    String price;

    Builder id(Integer id) {
        this.id = id;
        return this;
    }

    Builder bun(String bun) {
        this.bun = bun;
        return this;
    }

    Builder cheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    Builder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    Builder weight(String weight) {
        this.weight = weight;
        return this;
    }

    Builder price(String price) {
        this.price = price;
        return this;
    }
}
