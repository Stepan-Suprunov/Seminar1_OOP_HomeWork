public class Chocolate extends Product {

    protected int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Chocolate(int article, String name, String brand, int calories, double price) {
        super(article, name, brand, price);
        this.calories = calories;
    }

    @Override
    String displayInfo() {
        return String.format("Article: %d; Name: %s; Brand: %s; Calories: %d; Price: %f;", article, name, brand, calories, price);
    }
}
