package com.example.fileread.io;

import com.example.fileread.bean.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public Product[] readProducts(String fileName) throws IOException {
        int lines = getNumberOfLine(fileName);
        Product[] products = new Product[lines];
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        for (Product product : products) {
            line = bufferedReader.readLine();
            product = getProduct(line);
        }
        return products;

    }

    private Product getProduct(String line) {
        String[] split = line.split(",");
        Product product = new Product();
        product.setProductName(split[0]);
        product.setProductId(Integer.parseInt(split[1]));
        product.setProductPrice(Double.parseDouble(split[2]));
        product.setProductWeight(Double.parseDouble(split[3]));
        product.setProductDetails(split[4]);
        return product;
    }

    private int getNumberOfLine(String fileName) throws IOException {
        int response = 0;
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        do {
            line = bufferedReader.readLine();
            response++;
        } while (line != null);
        return response;
    }
}
