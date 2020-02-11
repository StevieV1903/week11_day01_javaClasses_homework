public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int canDrinkFromBottle(){
        int volumeRemaining = (this.volume -= 10);
        return volumeRemaining;
    }

    public int canEmptyBottle(){
        int emptyBottle = (this.volume = 0);
        return emptyBottle;
    }

    public int canFillFullBottle(){
        int fullBottle = (this.volume = 100);
        return fullBottle;
    }


}

