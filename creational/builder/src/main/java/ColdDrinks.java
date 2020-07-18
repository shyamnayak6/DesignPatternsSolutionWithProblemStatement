public abstract class ColdDrinks implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
