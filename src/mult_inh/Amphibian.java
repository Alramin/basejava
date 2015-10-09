package mult_inh;

public class Amphibian extends Transport implements Drivable, Swimmable{

    @Override
    public void move() {
        if (isOnWater()) swim();
        else drive();
    }

    private boolean isOnWater() {
        return (int)(200 * Math.random()) %2 == 0;
    }
}
