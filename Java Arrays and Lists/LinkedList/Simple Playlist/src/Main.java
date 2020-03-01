import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album OKComputer = new Album("OK Computer", "Radiohead");
        OKComputer.addSong("Karma Police", 3.36);
        OKComputer.addSong("Paranoid Android", 7.58);
        OKComputer.addSong("Street Spirit", 4.12);
        OKComputer.addSong("Creep", 4.25);
        OKComputer.addSong("Videotape", 3.45);
        OKComputer.addSong("Fake Plastic Trees", 4.40);
        OKComputer.addSong("Exit Music", 5.10);
        albums.add(OKComputer);

        Album Meds = new Album("Meds", "Placebo");
        Meds.addSong("Meds", 3.56);
        Meds.addSong("Every You, Every Me", 4.46);
        Meds.addSong("Song to Say Goodbye", 5.12);
        Meds.addSong("Broken Promise", 4.24);
        Meds.addSong("Infra-Red", 3.44);
        Meds.addSong("Pure Morning", 4.12);
        Meds.addSong("Twenty Years", 5.10);
        albums.add(Meds);

        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addSongToPlaylist("Creep", playlist);
        albums.get(0).addSongToPlaylist("Videotape", playlist);
        albums.get(0).addSongToPlaylist("Exit Music", playlist);
        albums.get(0).addSongToPlaylist("Lotus Flower", playlist); //Does not exist
        albums.get(1).addSongToPlaylist("Song to Say Goodbye", playlist);
        albums.get(1).addSongToPlaylist("Twenty Years", playlist);
        albums.get(1).addSongToPlaylist("Pure Morning", playlist);
        albums.get(1).addSongToPlaylist("Without You, I am Nothing", playlist); //Does not exist

        playMenu(playlist);
    }

    public static void playMenu(LinkedList<Song> playlist){
        if (playlist.size() == 0){
            System.out.println("\nThere are no songs in the playlist.");
        } else {
            ListIterator<Song> songListIterator = playlist.listIterator();
            if (songListIterator.hasNext()){
                System.out.println("\nPlaying: " + songListIterator.next().toString());
            }
            boolean exit = false;
            while (!exit){
                int selection = getUserSelection();
                switch (selection){
                    case 1:
                        if (songListIterator.hasNext()){
                            System.out.println("\nPlaying Next Song: " + songListIterator.next().toString());
                        } else {
                            System.out.println("You have reached the beginning of this playlist.");
                        }
                        break;
                    case 2:
                        if (songListIterator.hasPrevious()){
                            System.out.println("\nPlaying Previous Song: " + songListIterator.previous().toString());
                        } else {
                            System.out.println("You have reached the end of this playlist.");
                        }
                        break;
                    case 3:
                        System.out.println("Exiting playlist...");
                        exit = true;
                        break;
                }
            }
        }
    }

    public static int getUserSelection(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("1. Play Next Song");
        System.out.println("2. Play Previous Song");
        System.out.println("3. Exit Playlist");
        System.out.println("Please enter your selection: ");
        int userSelection = in.nextInt();
        in.nextLine();
        if (userSelection < 1 || userSelection > 3){
            getUserSelection();
        }
        return userSelection;
    }
}
