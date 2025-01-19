public class Pizza {
    private String taille;
    private String pate;
    private String fromage;
    private String pepperoni;
    private String champignons;

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public void setPate(String pate) {
        this.pate = pate;
    }

    public void setFromage(String fromage) {
        this.fromage = fromage;
    }

    public void setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setChampignons(String champignons) {
        this.champignons = champignons;
    }

    @Override
    public String toString() {
        return "Pizza [taille=" + taille + ", pate=" + pate + ", fromage=" + fromage + ", pepperoni=" + pepperoni + ", champignons=" + champignons + "]";
    }
}