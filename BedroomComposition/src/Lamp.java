public class Lamp {
    private String type;
    private boolean battery;
    private int globRating;

    public Lamp(String type, boolean battery, int globRating) {
        this.type = type;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.print("Lamp -> Turning on");
    }

    public String getType() {
        return type;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
