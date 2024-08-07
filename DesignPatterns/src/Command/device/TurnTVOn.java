package Command.device;

//concrete command
public class TurnTVOn implements Command{

    //object reference
    ElectronicDevice device;

    public TurnTVOn(ElectronicDevice device){
        this.device = device;
    }//end ctor

    @Override
    public void execute() {
        device.on();
    }//end execute

    @Override
    public void undo() {
        device.off();
    }//end undo
}//end TurnTVOn
