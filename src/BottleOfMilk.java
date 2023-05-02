public class BottleOfMilk extends BottleOfWatter {

    protected double fat;

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public BottleOfMilk(int article, String name, String brand, double volume, double fat, double price) {
        super(article, name, brand, volume, price);
        this.fat = fat;
    }

    @Override
    String displayInfo() {
        return String.format("Article: %d; Name: %s; Brand: %s; Volume: %f; Fat: %f; Price: %f;", article, name, brand, volume, fat, price);
    }
}
