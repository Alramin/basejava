package mult_inh;

public interface Swimmable {

    default void swim() {
        System.out.println("swim");
    }
}
