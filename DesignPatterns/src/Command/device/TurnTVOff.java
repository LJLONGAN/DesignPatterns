package Command.device;

//concrete command
public class TurnTVOff implements Command{

    //object reference
    ElectronicDevice device;

    public TurnTVOff(ElectronicDevice device){
        this.device = device;
    }//end ctor

    @Override
    public void execute() {
        device.off();
    }//end execute

    @Override
    public void undo() {
        device.on();
    }//end undo
}//end TurnTVOff
