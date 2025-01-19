public class Main {
    public static void main(String[] args) {
        Album lonerism = new Album.AlbumBuilder("Lonerism", "Tame Impala")
            .countryArtist("Australie")
            .parutionYear("2012")
            .genre("indie rock")
            .build();

        Album orange = new Album.AlbumBuilder("channel ORANGE", "Frank Ocean")
            .parutionYear("2012")
            .genre("R&B")
            .build();

        Album visions = new Album.AlbumBuilder("Visions", "Grimes")
            .parutionYear("2012")
            .label("4AD")
            .genre("Electronic")
            .build();
    }
}