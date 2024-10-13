package Builder;

public class CheeseBurgerBuilder extends Builder{
    Integer id;
    String bun;
    String cheese;
    String sauce;
    String patty = "cheese";
    String weight;
    String price;

    CheeseBurgerBuilder id(Integer id) {
        this.id = id;
        return this;
    }
    CheeseBurgerBuilder bun(String bun) {
        this.bun = bun;
        return this;
    }
    CheeseBurgerBuilder cheese(String cheese) {
        this.cheese = cheese;
        return this;
    }
    CheeseBurgerBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }
    CheeseBurgerBuilder weight(String weight) {
        this.weight = weight;
        return this;
    }
    CheeseBurgerBuilder price(String price) {
        this.price = price;
        return this;
    }
    
}
