package wk3;

public class Product {
    private int productId;
    private String name;
    private double price;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public Product(int productId, String name, double price){
        setProductId(productId);
        setName(name);
        setPrice(price);
    }
}
