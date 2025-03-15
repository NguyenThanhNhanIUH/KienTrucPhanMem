package compositePattern;

class Product implements ProductComponent {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showProperty() {
        System.out.println("Product [name=" + name + ", price=" + price + "]");
    }

    @Override
    public int totalPrice() {
        return price;
    }
}
