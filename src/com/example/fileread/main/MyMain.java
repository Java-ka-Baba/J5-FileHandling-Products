package com.example.fileread.main;

import com.example.fileread.bean.Product;
import com.example.fileread.io.FileRead;

import java.io.IOException;

public class MyMain {
    public static void main(String[] args) {
        FileRead fileRead = new FileRead();
        try {
            Product[] products = fileRead.readProducts("resources/products.csv");
            Product highestPrice = getHighPriceProduct(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static Product getHighPriceProduct(Product[] products) {
        double highestPrice = 0;
        Product response = null;
        for (Product product : products) {
            if (highestPrice < product.getProductPrice()) {
                highestPrice = product.getProductPrice();
                response = product;

            }
        }

        return response;
    }
}
