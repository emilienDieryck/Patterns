import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {

    private Map<String,Produit> bac= new HashMap<>();

    public void ajouter(String name, int anneeDeParution){
        Produit p = retourner(name);
        bac.put(name, p);
    }

    public Produit retourner(String name){
        return bac.get(name);
    }

    public abstract Produit ajouterProduit(String name, int anneeDeParution);
}
