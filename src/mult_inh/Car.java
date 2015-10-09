package mult_inh;

public class Car extends Transport implements Drivable {

    @Override
    public void move() {
        drive();
    }
}
