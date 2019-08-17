package pl.sda.jdbc.hibernate.exrcise.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderline")
public class Orderline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "orders_id")
    private Orders orders;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "products_id")
    private Products products;

    @Column(name = "quality")
    private String quality;

    public Orderline() {
    }

    public Orderline(String quality) {
        this.quality = quality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Orderline{" +
                "id=" + id +
                ", orders=" + orders +
                ", products=" + products +
                ", quality='" + quality + '\'' +
                '}';
    }

}
