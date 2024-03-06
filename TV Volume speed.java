package ModelSem1;

public class Tv {
    private int volumeLevel;
    private boolean on;

    public Tv() {
        this.volumeLevel = 10; // Default volume level is 10
        this.on = false; // TV is initially turned off
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        this.on = true;
        System.out.println("TV is turned on.");
    }

    public void turnOff() {
        this.on = false;
        System.out.println("TV is turned off.");
    }

    public boolean setVolumeLevel(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 20) {
            this.volumeLevel = newVolumeLevel;
            System.out.println("Volume level set to " + newVolumeLevel);
            return true;
        } else {
            System.out.println("Cannot set volume level. TV is either off or the volume level is out of range.");
            return false;
        }
    }

    public void volumeUp() {
        if (on && volumeLevel < 20) {
            volumeLevel++;
            System.out.println("Volume level increased to " + volumeLevel);
        } else {
            System.out.println("Volume is already at maximum level.");
        }
    }

    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
            System.out.println("Volume level decreased to " + volumeLevel);
        } else {
            System.out.println("Volume is already at minimum level.");
        }
    }
}
