package entities.products;

public class ImportedProduct extends Product {

    // Attributes
    private Double customsFee;

    // Constructors
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public ImportedProduct() {
        super();
    }

    // Getters and setters
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    // Methods
    public Double totalPrice() {
        return price + customsFee; // Price foi alterado para 'protected' para poder usar aqui.
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Customs fee: $ %.2f)", name, this.totalPrice(), customsFee); // Name também foi alterado para 'protected'.
    }



}
