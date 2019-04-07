public class Program{
    public static void main(String [] args){
        // IElectronicDevice tv = TvRemote.getDevice(); // if we do this the volume up and down won't be able to manipulate values
        Television tv = TvRemote.getDevice();
        PowerButton pwrButton = new PowerButton(tv);
        VolumeButton volButton = new VolumeButton(tv);
        pwrButton.execute();
        pwrButton.undo();    
        volButton.up();
        volButton.down();
    }

}