import java.util.ArrayList;
import java.util.List;

public class CollectionLivres implements Collection<String> {
    private List<String> livres = new ArrayList<>();

    public void ajouterLivre(String livre) {
        livres.add(livre);
    }

    @Override
    public Iterateur<String> creerIterateur() {
        return new IterateurLivres(this);
    }

    public List<String> getLivres() {
        return livres;
    }
}