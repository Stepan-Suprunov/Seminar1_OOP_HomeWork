public class Product {

    protected int article;
    protected String name;
    protected String brand;
    protected double price;

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int article, String name, String brand, double price) {
        this.article = article;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    String displayInfo() {
        return String.format("Article: %d; Name: %s; Brand: %s; Price: %f;", article, name, brand, price);
    }
}
