package abstraction_packages_exceptionhandling.music.string;

import abstraction_packages_exceptionhandling.music.Playable;

public class Veena implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Veena");
    }
}