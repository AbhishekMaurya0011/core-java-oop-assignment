/*As an admin,I want to product price details so that user cannot directly  */

// Product class to demonstrate encapsulation
class Product {

    // Declare private variable (cannot access directly)
    private int price;
    private String name;

    // public setter method to set price
    public void setPrice(int p) {
        price = p;
    }

    // public getter method to get price
    public int getPrice() {
        return price;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    // TEMPORARY main method
    public static void main(String[] args) {

        Product p = new Product();

        // setting values
        p.setName("Mobile");
        p.setPrice(100000);

        // getting values
        System.out.println("Product Name: " + p.getName());
        System.out.println("Product Price: " + p.getPrice());
    }
}
