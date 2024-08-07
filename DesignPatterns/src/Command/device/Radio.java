package Command.device;

//Receiver
public class Radio implements ElectronicDevice {
    //instance fields
    private int volume = 0;
    private boolean radioOn = false;

    public Radio(){}//no arg ctor

    //Overrides
    @Override
    public void on() {
        radioOn = true;
        System.out.println("Radio is on");
    }//end on

    @Override
    public void off() {
        radioOn = false;
        System.out.println("Radio is off");
    }//end off

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Radio Volume is at: " + volume);
    }//end volumeUp

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Radio Volume is at: " + volume);
    }//end volumeDown
}//end Radio