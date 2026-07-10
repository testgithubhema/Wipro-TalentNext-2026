package abstraction_packages_exceptionhandling.interfaces_newfeatures;

public interface FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }
}