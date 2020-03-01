import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addSong(String title, double duration){
        if (checkIfSongExists(title)){
            System.out.println("This song already exists in the album.");
        } else {
            songs.add(new Song(title, duration));
        }
    }

    public boolean checkIfSongExists(String title){
        if (getTotalNumberOfSongs() > 0){
            for (Song song : songs) {
                if (song.getTitle().equalsIgnoreCase(title)){
                    return true;
                }
            }
        }
        return false;
    }

    public int getTotalNumberOfSongs(){
        return songs.size();
    }

    public void addSongToPlaylist(String title, LinkedList<Song> playlist){
        Song song = getSong(title);
        if (song != null){
            playlist.add(song);
            System.out.println("Song added to playlist.");
        } else {
            System.out.println("Song requested is not in the album.");
        }
    }

    public Song getSong(String title){
        if (checkIfSongExists(title)){
            for (Song song : songs) {
                if (song.getTitle().equalsIgnoreCase(title)){
                    return song;
                }
            }
        }
        return null;
    }
}
