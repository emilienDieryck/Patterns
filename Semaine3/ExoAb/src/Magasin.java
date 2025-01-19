import java.util.HashMap;
import java.util.Map;

public class Magasin {

    private Map<String,Produit> bac= new HashMap<>();
    private AbstractFactory factory;

    public Magasin(AbstractFactory factory){
        this.factory = factory;
    }

    public void ajouter(String name, int anneeDeParution){
        Produit p = retourner(name);
        bac.put(name, p);
    }

    public Produit retourner(String name){
        return bac.get(name);
    }


}
