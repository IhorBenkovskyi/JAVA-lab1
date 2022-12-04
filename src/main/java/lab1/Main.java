package lab1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ProductCategory productCategory = new ProductCategory.Builder()
                .setName("Food")
                .setDescription("Food products")
                .setProducts(new Product[]{
                        new Product.Builder()
                                .setName("Bread")
                                .setPrice(10)
                                .setQuantity(100)
                                .build(),
                        new Product.Builder()
                                .setName("Milk")
                                .setPrice(20)
                                .setQuantity(50)
                                .build()
                })
                .build();
        System.out.println(productCategory);
        Employee employee = new Employee.Builder()
                .setName("John")
                .setAddress("London")
                .setSalary(1000)
                .setPosition("Manager")
                .build();
        System.out.println(employee);
    }
}
