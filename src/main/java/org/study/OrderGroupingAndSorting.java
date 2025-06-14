package org.study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderGroupingAndSorting {
    class Order {
        private String id;
        private String status;
        private double value;

        public Order(String id, String status, double value) {
            this.id = id;
            this.status = status;
            this.value = value;
        }

        public String getId() { return id; }
        public String getStatus() { return status; }
        public double getValue() { return value; }
    }

    public static void main(String sk[]){
        OrderGroupingAndSorting obj=new OrderGroupingAndSorting();
        List<Order> orders = Arrays.asList(
                obj.new Order("O1", "PENDING", 120.0),
                obj.new Order("O2", "COMPLETED", 250.5),
                obj.new Order("O3", "PENDING", 80.0),
                obj.new Order("O4", "CANCELLED", 60.0),
                obj.new Order("O5", "COMPLETED", 100.0)
        );

        orders.stream().collect(Collectors.groupingBy(Order::getStatus,Collectors.summingDouble(Order::getValue))).forEach((status,total)->System.out.println(status+"->"+total));
    }
}
