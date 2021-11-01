package ro.fasttrackit.homework7;

public class Product {
    private String name;
    private double price;
    private int    quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name     = name;
        this.price    = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName()     { return name; }
    public double getPrice()    { return price; }
    public int getQuantity()    { return quantity; }
    public String getCategory() { return category; }
    public boolean hasStock()   { return quantity > 0; }
    public boolean isCategory(String category) {
        return this.category.equalsIgnoreCase(category);
    }
    public String hasStockResponse() {
        return hasStock()?
                "Yes, this item is still in stock":
                "We are sorry, this item is out of stock";
    }

}
