package wk3;

public class Store {
    private int numProducts;
    private Product[] products;

    public Store (int maxCapacity) {
        if (maxCapacity <= 0) {
            maxCapacity = 10;
        }
        this.products = new Product[maxCapacity];
        this.numProducts = 0;
    }
    public void addProduct(Product product){
        if (product == null){
            return;
        }
        if(numProducts < products.length) {
            products[numProducts] = product;
            numProducts++;
        }
    }
    public double getTotalValueOfProducts() {
            double total = 0.0;
            for (int i = 0; i < numProducts; i++) {
                total += products[i].getPrice();
            }
            return total;
        }
    public int getNumberOfProducts() {
        return numProducts;
    }

    public int getMaxCapacity() {
        return products.length;
    }
}









