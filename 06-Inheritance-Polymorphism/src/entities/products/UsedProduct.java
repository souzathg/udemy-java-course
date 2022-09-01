package entities.products;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {
    // Attributes
    private Date manufactureDate;

    // Constructors
    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct() {
        super();
    }

    // Getters and setters
    public Date manufactureDate() {
        return manufactureDate;
    }

    public void manufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    // Method
    @Override
    public String priceTag() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return String.format("%s (used) $ %.2f (Manufacture: %s)", name, this.getPrice(), dateFormat.format(manufactureDate));
    }
}
