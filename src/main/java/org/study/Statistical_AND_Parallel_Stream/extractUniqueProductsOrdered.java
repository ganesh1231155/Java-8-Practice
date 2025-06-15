package org.study.Statistical_AND_Parallel_Stream;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

//From a nested JSON-like structure (e.g., List<Customer> → List<Order>),
// extract all unique products ordered.
class Customer {
    private String customerId;
    private String name;
    private List<Order> orders;

    // All-args constructor
    public Customer(String customerId, String name, List<Order> orders) {
        this.customerId = customerId;
        this.name = name;
        this.orders = orders;
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

class Order {
    private String orderId;
    private Date orderDate;
    private List<Product> products;

    // All-args constructor
    public Order(String orderId, Date orderDate, List<Product> products) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.products = products;
    }
    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

class Product {
    private String productId;
    private String name;
    private double price;

    // All-args constructor
    public Product(String productId, String name,double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}


class ProductSummary {
    String customerId;
    String customerName;
    String orderId;
    Date orderDate;
    String productId;
    String productName;
    double productPrice;
    // constructor
    public ProductSummary(String customerId, String customerName,
                          String orderId, Date orderDate,
                          String productId, String productName,double productPrice) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer: %s (%s) || Order: %s || Date: %s || Product: %s (%s) || Price: $%.2f",
                customerName,
                customerId,
                orderId,
                orderDate,
                productName,
                productId,
                productPrice
        );
    }
}

public class extractUniqueProductsOrdered {



    public static void main(String sk[]){
        Product p1 = new Product("P001", "Laptop", 1200.00);
        Product p2 = new Product("P002", "Smartphone", 799.99);
        Product p3 = new Product("P003", "Keyboard", 49.99);
        Product p4 = new Product("P004", "Mouse", 25.00);
        Product p5 = new Product("P005", "Monitor", 299.50);
        Product p6 = new Product("P006", "Headphones", 89.00);

        // Orders for Customer 1
        Order o1 = new Order("O001", new Date(), Arrays.asList(p1, p2, p3));
        Order o2 = new Order("O002", new Date(), Arrays.asList(p4, p5));

        // Orders for Customer 2
        Order o3 = new Order("O003", new Date(), Arrays.asList(p2, p4, p6));
        Order o4 = new Order("O004", new Date(), Arrays.asList(p1, p3));

        // Orders for Customer 3
        Order o5 = new Order("O005", new Date(), Arrays.asList(p5, p6, p1));
        Order o6 = new Order("O006", new Date(), Arrays.asList(p3, p4));

        // Customers
        Customer c1 = new Customer("C001", "Alice", Arrays.asList(o1, o2));
        Customer c2 = new Customer("C002", "Bob", Arrays.asList(o3, o4));
        Customer c3 = new Customer("C003", "Charlie", Arrays.asList(o5, o6));

        List<Customer> customers = Arrays.asList(c1, c2, c3);

        customers.stream()
                .flatMap(customer -> customer.getOrders().stream()
                    .flatMap(order -> order.getProducts().stream()
                        .map(product -> new ProductSummary(
                                            customer.getCustomerId(),
                                            customer.getName(),
                                            order.getOrderId(),
                                            order.getOrderDate(),
                                            product.getProductId(),
                                            product.getName(),
                                            product.getPrice()
                                        )
                        )
                    )
                )
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
