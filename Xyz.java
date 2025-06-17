import java.util.*;
import java.time.Year;

class Song {
    private int serialno;
    private String title;
    private Set<String> artists;
    private int releaseYear;
    private double rating;

    public Song(int serialno, String title, Set<String> artists, int releaseYear, double rating) {
        this.serialno = serialno;
        this.title = title;
        this.artists = artists;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public int getSerialno() {
        return serialno;
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getArtists() {
        return artists;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return serialno + ". " + title + " (" + releaseYear + "), Artists: " + String.join(", ", artists) + ", Rating: " + rating;
    }
}

class SongCollection {
    private List<Song> songs;

    public SongCollection() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void displaySongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public List<Song> sortByTitle() {
        List<Song> sortedSongs = new ArrayList<>(songs);
        sortedSongs.sort(Comparator.comparing(Song::getTitle));
        return sortedSongs;
    }

    public List<Song> sortByReleaseYear() {
        List<Song> sortedSongs = new ArrayList<>(songs);
        sortedSongs.sort(Comparator.comparingInt(Song::getReleaseYear).reversed());
        return sortedSongs;
    }

    public List<Song> searchByTitle(String title) {
        List<Song> results = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(song);
            }
        }
        return results;
    }

    public List<Song> getSongsReleasedInCurrentYear() {
        List<Song> results = new ArrayList<>();
        int currentYear = Year.now().getValue();
        for (Song song : songs) {
            if (song.getReleaseYear() == currentYear) {
                results.add(song);
            }
        }
        return results;
    }

    public List<Song> getSongsByArtist(String artist) {
        List<Song> results = new ArrayList<>();
        for (Song song : songs) {
            for(String songArtist : song.getArtists()){
                if (songArtist.toLowerCase().equals(artist.toLowerCase())) {
                    results.add(song);
                }
            }
        }
        return results;
    }

    public List<String> getTitleAndReleaseYear() {
        List<String> results = new ArrayList<>();
        for (Song song : songs) {
            results.add(song.getTitle() + " (" + song.getReleaseYear() + ")");
        }
        return results;
    }

    public Song getMinRatingSong() {
        if (songs.isEmpty()) {
            return null;
        }
        return Collections.min(songs, Comparator.comparingDouble(Song::getRating));
    }

    public Song getMaxRatingSong() {
        if (songs.isEmpty()) {
            return null;
        }
        return Collections.max(songs, Comparator.comparingDouble(Song::getRating));
    }
}

public class SongManager {
    public static void main(String[] args) {
        Set<String> artists1 = new HashSet<>(Arrays.asList("Queen"));
        Set<String> artists2 = new HashSet<>(Arrays.asList("John Lennon"));
        Set<String> artists3 = new HashSet<>(Arrays.asList("Ed Sheeran"));
        Set<String> artists4 = new HashSet<>(Arrays.asList("The Weeknd"));
        Set<String> artists5 = new HashSet<>(Arrays.asList("Harry Styles"));
        Set<String> artists6 = new HashSet<>(Arrays.asList("Miley Cyrus"));

        SongCollection songCollection = new SongCollection();
        songCollection.addSong(new Song(1, "Bohemian Rhapsody", artists1, 1975, 4.9));
        songCollection.addSong(new Song(2, "Imagine", artists2, 1971, 4.8));
        songCollection.addSong(new Song(3, "Shape of You", artists3, 2017, 4.5));
        songCollection.addSong(new Song(4, "Blinding Lights", artists4, 2019, 4.7));
        songCollection.addSong(new Song(5, "As it was", artists5, 2022, 4.6));
        songCollection.addSong(new Song(6, "Flowers", artists6, Year.now().getValue(), 4.8));
        songCollection.addSong(new Song(7, "Another One Bites the Dust", artists1, 1980, 4.7));

        System.out.println("1. Display list of songs:");
        songCollection.displaySongs();

        System.out.println("\n2. Sorted by title:");
        songCollection.sortByTitle().forEach(System.out::println);

        System.out.println("\n3. Sorted by release year (latest first):");
        songCollection.sortByReleaseYear().forEach(System.out::println);

        System.out.println("\n4. Search song by title (imagine):");
        songCollection.searchByTitle("imagine").forEach(System.out::println);

        System.out.println("\n5. Songs released in " + Year.now().getValue() + ":");
        songCollection.getSongsReleasedInCurrentYear().forEach(System.out::println);

        System.out.println("\n6. Songs by artist (Queen):");
        songCollection.getSongsByArtist("Queen").forEach(System.out::println);

        System.out.println("\n7. Song title and release year:");
        songCollection.getTitleAndReleaseYear().forEach(System.out::println);

        System.out.println("\n8. Song with lowest rating:");
        System.out.println(songCollection.getMinRatingSong());

        System.out.println("\nSong with highest rating:");
        System.out.println(songCollection.getMaxRatingSong());
    }
}