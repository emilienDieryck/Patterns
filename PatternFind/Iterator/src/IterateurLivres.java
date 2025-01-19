public class IterateurLivres implements Iterateur<String> {
    private CollectionLivres collection;
    private int index = 0;

    public IterateurLivres(CollectionLivres collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getLivres().size();
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return collection.getLivres().get(index++);
        }
        return null;
    }
}