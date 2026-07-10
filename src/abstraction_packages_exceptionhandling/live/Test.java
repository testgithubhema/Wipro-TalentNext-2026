package abstraction_packages_exceptionhandling.live;

import abstraction_packages_exceptionhandling.music.Playable;
import abstraction_packages_exceptionhandling.music.string.Veena;
import abstraction_packages_exceptionhandling.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();

        veena.play();
        saxophone.play();

        Playable veenaObj = new Veena();
        Playable saxophoneObj = new Saxophone();

        veenaObj.play();
        saxophoneObj.play();
    }
}