package pl.sda.jdbc.hibernate.exrcise.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "available")
    private boolean available;

    @Column(name = "purchase_price")
    private  double purchasePrice;

    @Column(name = "selling_price")
    private  double sellingPrice;

    @Column(name = "weight")
    private  double weight;

    @Column(name = "storageLocation")
    private String storageLocation;

    public Products() {
    }

    public Products(String description, boolean available, double purchasePrice, double sellingPrice, double weight, String storageLocation) {
        this.description = description;
        this.available = available;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.weight = weight;
        this.storageLocation = storageLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", available=" + available +
                ", purchasePrice=" + purchasePrice +
                ", sellingPrice=" + sellingPrice +
                ", weight=" + weight +
                ", storageLocation='" + storageLocation + '\'' +
                '}';
    }
}
