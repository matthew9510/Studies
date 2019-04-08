public class Radio implements IElectronicDevice{
    private int volume; // member variables remain but function calls will not be available

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

    public void on(){
        System.out.println("Radio on...");
    }

    public void off(){
        System.out.println("Radio off...");
    }

    public void volumeDown(){
        int currentVolume;
        if(volume != 0){
            currentVolume = getVolume(); // internal 
            setVolume(--currentVolume);
        }
        System.out.println("Radio volume level is " + getVolume());
    }

    public void volumeUp(){
        int currentVolume;
        if(volume != 100){
            currentVolume = getVolume();
            setVolume(++currentVolume);
        }
        System.out.println("Radio volume level is " + getVolume());
    }

}