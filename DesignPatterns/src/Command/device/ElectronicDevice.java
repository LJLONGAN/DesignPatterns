package Command.device;

public interface ElectronicDevice {
    //Commands that receiver classes will implement
    void on();

    void off();

    void volumeUp();

    void volumeDown();
}//end ElectronicDevice
