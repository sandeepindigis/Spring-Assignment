package org.example.data_jpa_procedure_04.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {

    @Id
    private Integer product_id;
    private String product_name;
    private String product_price;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_price='" + product_price + '\'' +
                '}';
    }
}
