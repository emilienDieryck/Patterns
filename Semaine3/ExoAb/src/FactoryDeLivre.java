public class FactoryDeLivre implements AbstractFactory {

	@Override
	public Produit ajouterProduit(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
}
