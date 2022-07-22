package com.hcl.July22;

interface Product {
    public void getAllProducts();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Product p = new Product() {
            public void getAllProducts() {
                System.out.println("All products has been displayed");
            }
        };
        p.getAllProducts();
    }
}
