package Command.device;

//Receiver
public class Television implements ElectronicDevice {
    //instance fields
    private int volume = 0;

    public Television(){}//no arg ctor

    //Overrides
    @Override
    public void on() {
        System.out.println("Tv is on!");
    }//end on

    @Override
    public void off() {
        System.out.println("TV is off!");
    }//end off

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV volume is at " + volume);
    }//end volumeUp

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV volume is at " + volume);
    }//end volumeDown
}//end Television