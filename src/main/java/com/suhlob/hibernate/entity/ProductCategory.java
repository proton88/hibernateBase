package com.suhlob.hibernate.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_categories")
public class ProductCategory extends Model {

    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_product_ctg", referencedColumnName = "id")
    private ProductCategory parentProductCategory;

    @OneToMany(mappedBy = "productCategory")
    private Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProductCategory getParentProductCategory() {
        return parentProductCategory;
    }

    public void setParentProductCategory(ProductCategory parentProductCategory) {
        this.parentProductCategory = parentProductCategory;
    }
}
