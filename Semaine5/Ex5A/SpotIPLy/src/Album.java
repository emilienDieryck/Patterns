public class Album {
    private final String title; // obligatoire
    private final String nameArtist; // obligatoire
    private final  String label; // optionnel
    private final String producer; // optionnel
    private final String countryArtist; // optionnel
    private final String version; // optionnel
    private final String genre; // optionnel
    private final String parutionYear; // optionnel
    private final boolean remastered; // optionnel
    private final String originalParutionYear; // optionnel
    private final String debitStandard; // optionnel
    private final String debitAbonne; // optionnel

    private Album(AlbumBuilder builder) {
        this.title = builder.title;
        this.nameArtist = builder.nameArtist;
        this.label = builder.label;
        this.producer = builder.producer;
        this.countryArtist = builder.countryArtist;
        this.version = builder.version;
        this.genre = builder.genre;
        this.parutionYear = builder.parutionYear;
        this.remastered = builder.remastered;
        this.originalParutionYear = builder.originalParutionYear;
        this.debitStandard = builder.debitStandard;
        this.debitAbonne = builder.debitAbonne;
    }

    public String getTitle() {
        return title;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public String getLabel() {
        return label;
    }

    public String getProducer() {
        return producer;
    }

    public String getCountryArtist() {
        return countryArtist;
    }

    public String getVersion() {
        return version;
    }

    public String getGenre() {
        return genre;
    }

    public String getParutionYear() {
        return parutionYear;
    }

    public boolean isRemastered() {
        return remastered;
    }

    public String getOriginalParutionYear() {
        return originalParutionYear;
    }

    public String getDebitStandard() {
        return debitStandard;
    }

    public String getDebitAbonne() {
        return debitAbonne;
    }

    public static class AlbumBuilder {
        private final String title; // obligatoire
        private final String nameArtist; // obligatoire
        private String label; // optionnel
        private String producer; // optionnel
        private String countryArtist; // optionnel
        private String version; // optionnel
        private String genre; // optionnel
        private String parutionYear; // optionnel
        private boolean remastered; // optionnel
        private String originalParutionYear; // optionnel
        private String debitStandard; // optionnel
        private String debitAbonne; // optionnel

        public AlbumBuilder(String title, String nameArtist) {
            this.title = title;
            this.nameArtist = nameArtist;
        }

        public AlbumBuilder label(String label) {
            this.label = label;
            return this;
        }

        public AlbumBuilder producer(String producer) {
            this.producer = producer;
            return this;
        }

        public AlbumBuilder countryArtist(String countryArtist) {
            this.countryArtist = countryArtist;
            return this;
        }

        public AlbumBuilder version(String version) {
            this.version = version;
            return this;
        }

        public AlbumBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public AlbumBuilder parutionYear(String parutionYear) {
            this.parutionYear = parutionYear;
            return this;
        }

        public AlbumBuilder remastered(boolean remastered) {
            this.remastered = remastered;
            return this;
        }

        public AlbumBuilder originalParutionYear(String originalParutionYear) {
            this.originalParutionYear = originalParutionYear;
            return this;
        }

        public AlbumBuilder debitStandard(String debitStandard) {
            this.debitStandard = debitStandard;
            return this;
        }

        public AlbumBuilder debitAbonne(String debitAbonne) {
            this.debitAbonne = debitAbonne;
            return this;
        }

        public Album build() {
            return new Album(this);
        }

    }
}
