public class BottleOfWatter extends Product {

    protected double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfWatter(int article, String name, String brand, double volume, double price) {
        super(article, name, brand, price);
        this.volume = volume;
    }

    @Override
    String displayInfo() {
        return String.format("Article: %d; Name: %s; Brand: %s; Volume: %f; Price: %f;", article, name, brand, volume, price);
    }
}
