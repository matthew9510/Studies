public class VolumeButton implements IVolumeCommand{
    IElectronicDevice device; 
    public VolumeButton(IElectronicDevice device){
        this.device = device;
    }
    public void up(){
        device.volumeUp();
    }
    public void down(){
        device.volumeDown();
    }
}