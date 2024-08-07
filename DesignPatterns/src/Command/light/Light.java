package Command.light;

//Receiver
public class Light {
    private boolean on;

    public Light(){}//no arg ctor

    public void switchOn() {
        on = true;
    }//end switchOn

    public void switchOff() {
        on = false;
    }//end switchOff
}//end Light
