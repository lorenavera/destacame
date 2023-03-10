package com.co.destacame.models;

public class ProductModel {
    private String product;
    private String id_product;
    private String other_product;
    private String id_other_product;

    public ProductModel(String product, String id_product, String other_product, String id_other_product) {
        this.product = product;
        this.id_product = id_product;
        this.other_product = other_product;
        this.id_other_product = id_other_product;
    }

    public String getProduct() {
        return product;
    }

    public String getId_product() {
        return id_product;
    }

    public String getOther_product() {
        return other_product;
    }

    public String getId_other_product() {
        return id_other_product;
    }
}
