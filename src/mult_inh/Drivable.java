package mult_inh;

public interface Drivable {

    default void drive() {
        System.out.println("drive");
    }


}
