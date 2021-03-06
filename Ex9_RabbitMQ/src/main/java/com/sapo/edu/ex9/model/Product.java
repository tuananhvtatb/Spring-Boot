package com.sapo.edu.ex9.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import java.time.LocalDateTime;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Product.class)
@Data
public class Product {

    private Integer idProduct;
    private Integer amountSell;
    private LocalDateTime dateExpress;

    @Override
    public String toString() {
        return "Product [idProduct=" + idProduct + ", amountSell=" + amountSell + "]" + ", dateExpress="+dateExpress;
    }

}
