package state;

public class ReadyState extends State{

    public ReadyState(Phone phone){
        super(phone);
    }

    @Override
    public void onHomeButton() {

    }

    @Override
    public void onOffButton() {
        phone.setState(new LockedState(phone));
    }
}
