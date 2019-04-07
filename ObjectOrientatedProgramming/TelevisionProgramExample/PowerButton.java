public class PowerButton implements IPowerCommand{
    
    IElectronicDevice device;

    public PowerButton(IElectronicDevice device){
        this.device = device;
    }

    public void execute(){
        device.on();
    }

    public void undo(){
        device.off();
    }
}