package mult_inh;

public class Boat extends Transport implements Swimmable {


    @Override
    public void move() {
        swim();
    }
}
