import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MusicOrganizer {
    private ArrayList<String> tracks;
    private Random random;

    public MusicOrganizer() {
        tracks = new ArrayList<>();
        random = new Random();
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public void playRandomTrack() {
        if (tracks.size() == 0) {
            System.out.println("No tracks available");
            return;
        }

        int index = random.nextInt(tracks.size());
        System.out.println("Playing: " + tracks.get(index));
    }

    public void playAllRandom() {
        ArrayList<String> copy = new ArrayList<>(tracks);
        Collections.shuffle(copy);

        for (String track : copy) {
            System.out.println("Playing: " + track);
        }
    }
}
