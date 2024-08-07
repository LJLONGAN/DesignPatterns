package Command.device;

import java.util.List;

public class TurnItAllOff implements Command{
    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }//ctor

    public void execute() {
        for (ElectronicDevice device : theDevices) {
            device.off();
        }//end for
    }//end execute

    public void undo() {
        for (ElectronicDevice device : theDevices) {
            device.on();
        }//end for
    }//end undo
}//end TurnItAllOff
