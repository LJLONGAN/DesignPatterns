package Command.device;

//concrete command
public class TurnTVUp implements Command{

    //object reference
    ElectronicDevice device;

    public TurnTVUp(ElectronicDevice device){
        this.device = device;
    }//end ctor

    @Override
    public void execute() {
        device.volumeUp();
    }//end execute

    @Override
    public void undo() {
        device.volumeDown();
    }//end undo
}//end TurnTVUp
