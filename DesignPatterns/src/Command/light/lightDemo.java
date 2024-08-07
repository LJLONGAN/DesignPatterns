package Command.light;

//client
public class lightDemo {
    public static void main(String[] args) {
        //create Invoker and Receiver objects
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        //create Command objects
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        //Switch on
        control.setCommand(lightsOn);
        control.pressButton();

        //Switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }//end main
}//end CommandDemo