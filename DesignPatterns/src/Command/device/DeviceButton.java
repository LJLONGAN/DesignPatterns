package Command.device;
// This is known as the invoker
// It has a method press() that when executed
// causes the execute method to be called

// The execute method for the Command interface then calls
// the method assigned in the class that implements the
// Command interface
public class DeviceButton {
    Command command;

    public DeviceButton(Command command){
        this.command = command;
    }//end ctor

    public void press(){
        command.execute();
    }//end press

    public void pressUndo(){
        command.undo();
    }//end pressUndo
}//end DeviceButton
