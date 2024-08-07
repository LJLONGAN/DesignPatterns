package Command.device;

//concrete command
public class TurnTVDown implements Command{

    //object reference
    ElectronicDevice device;

    public TurnTVDown(ElectronicDevice device){
        this.device = device;
    }//end ctor

    @Override
    public void execute() {
        device.volumeDown();
    }//end execute

    @Override
    public void undo() {
        device.volumeUp();
    }//end undo
}//end TurnTVDown
