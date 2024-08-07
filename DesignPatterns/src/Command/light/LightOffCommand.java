package Command.light;

//Concrete Command
public class LightOffCommand implements Command {

    //Reference to light
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }//ctor

    @Override
    public void execute() {
        light.switchOff();//Explicit call of selected class's method
        System.out.println(light + " is off");
    }//end execute

    @Override
    public void undo() {
        light.switchOn();//Explicit call of selected class's method
        System.out.println(light + " is on");
    }//end undo
}//end LightOffCommand
