package abstraction_packages_exceptionhandling.interfaces_newfeatures;

public interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}