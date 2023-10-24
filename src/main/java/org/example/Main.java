package org.example;

public class Main {
    public static void main(String[] args) {
        //Product-1
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image.jpg");

        //Product-2
        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("image2.jpg");

        //Product-3
        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);;
        individualCustomer.setPhone("05000000");
        individualCustomer.setCustomerNumber("1254");
        individualCustomer.setFirstName("İnci Gülçin");
        individualCustomer.setLastName("Durak Yolcu");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("ABC");
        corporateCustomer.setCustomerNumber("451");
        corporateCustomer.setTaxNumber("1547989251478");
        corporateCustomer.setPhone("0242000000");

        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}