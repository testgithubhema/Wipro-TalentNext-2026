package abstraction_packages_exceptionhandling.music.wind;

import abstraction_packages_exceptionhandling.music.Playable;

public class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Saxophone");
    }
}