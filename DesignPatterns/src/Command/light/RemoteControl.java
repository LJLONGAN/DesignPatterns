package Command.light;

// Invoker Class
// It has a method pressButton() that when executed
// causes the execute method to be called

// The execute method for the Command interface then calls
// the method assigned in the class that implements the
// Command interface
public class RemoteControl {
    private Command command;

    public RemoteControl(){}//no arg ctor

    public void setCommand(Command command) {
        this.command = command;
    }//end setCommand

    public void pressButton() {
        command.execute();
    }//end pressButton
}//end RemoteControl
