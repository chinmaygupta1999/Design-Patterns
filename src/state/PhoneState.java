package state;

public abstract class State {

    public Phone phone;

    public State(Phone phone){
        this.phone = phone;
    }

    public abstract void onOffButton();
    public abstract void onHomeButton();
}
