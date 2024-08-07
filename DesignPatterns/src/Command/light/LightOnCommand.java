package Command.light;

//Concrete Command
public class LightOnCommand implements Command {

    //Reference to light
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }//ctor

    @Override
    public void execute() {
        light.switchOn();//Explicit call of selected class's method
        System.out.println(light + " is on");
    }//end execute

    @Override
    public void undo() {
        light.switchOff();
        System.out.println(light + " is off");
    }
}//end LightOnCommand
