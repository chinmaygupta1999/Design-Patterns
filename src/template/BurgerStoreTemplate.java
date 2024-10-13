package template;

public abstract class MakeBurger {

    public void create(){
        chooseBuns();
        addPatty();
        addSauce();
        grillBurger();
    }

    void chooseBuns();
    void addPatty();
    void addSauce();
    void grillBurger();
}
