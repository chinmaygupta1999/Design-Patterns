package Builder;

public class Builder {

    Burger build(Integer id, String bun, String cheese, String sauce, String patty, String weight, String price) {
        return new Burger(id, bun, cheese, sauce, patty, weight, price);
    }
}
