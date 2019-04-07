public class Television implements IElectronicDevice{
    private int volume;

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

    public void on(){
        System.out.println("Television on...");
    }

    public void off(){
        System.out.println("Television off...");
    }

    public void volumeDown(){
        int currentVolume;
        if(volume != 0){
            currentVolume = getVolume();
            setVolume(--currentVolume);
        }
        System.out.println("Volume level is " + getVolume());
    }

    public void volumeUp(){
        int currentVolume;
        if(volume != 100){
            currentVolume = getVolume();
            setVolume(++currentVolume);
        }
        System.out.println("Volume level is " + getVolume());
    }

}