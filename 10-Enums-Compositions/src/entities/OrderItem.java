package entities;

public class OrderItem {
    private Integer quantity;

    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public OrderItem() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        double subtotal = 0;
        for (int i = 1; i <= quantity; i++) {
            subtotal += product.getPrice();
        }
        return subtotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(product.getName())
                .append(", $").append(product.getPrice())
                .append(", Quantity: ").append(quantity)
                .append(", Subtotal: ").append(subTotal());
        return sb.toString();
    }
}
