public class Program{
    public static void main(String [] args){
       
        IElectronicDevice tv = TvRemote.getDevice(); // member variables from Television s.a. (volume) will be accessable through IElectronicDevice interface methods but function calls and member variables that are not defined in IElectronicDevice interface will not be accessable
        // System.out.println("TV vol is " + tv.volume); // attribute volume will not be accessable 
        PowerButton tvPwrButton = new PowerButton(tv);
        VolumeButton tvVolButton = new VolumeButton(tv);

        tvPwrButton.execute();
        tvPwrButton.undo();    
        tvVolButton.up();
        tvVolButton.down();
        
        System.out.println();

        IElectronicDevice radio = RadioRemote.getDevice(); // member variables from Radio s.a. (volume) will be accessable through IElectronicDevice interface methods but function calls and member variables that are not defined in IElectronicDevice interface will not be accessable
        // System.out.println("Radio vol is " + tv.volume); // attribute volume will not be accessable
        PowerButton radioPwrButton = new PowerButton(radio);
        VolumeButton radioVolButton = new VolumeButton(radio);
        
        radioPwrButton.execute();
        radioPwrButton.undo();
        radioVolButton.up();
        radioVolButton.down();
    }

}