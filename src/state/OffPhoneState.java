package state;

public class OffState extends State{

    public OffState(Phone phone){
        super(phone);

    }

    @Override
    public void onOffButton() {
        phone.setState(new );
    }

    @Override
    public void onHomeButton() {

    }
}
