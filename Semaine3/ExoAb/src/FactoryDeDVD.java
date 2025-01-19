public class FactoryDeDVD implements AbstractFactory {

	@Override
	public Produit ajouterProduit(String name, int anneeDeParution) {
		return new DVD(name, anneeDeParution);
	}
}
