package org.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
    private int transactionId;
    private String user;
    private double amount;

    public Transaction(int transactionId, String user, double amount) {
        this.transactionId = transactionId;
        this.user = user;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }
}

public class TotalTransactionAmountOfUser {
    public static void main(String sk[]) {
        List<Transaction> transactions = new ArrayList<>(Arrays.asList(
                new Transaction(1, "Alice", 150.0),
                new Transaction(2, "Bob", 200.0),
                new Transaction(3, "Alice", 100.0),
                new Transaction(4, "Bob", 50.0),
                new Transaction(5, "Charlie", 300.0),
                new Transaction(6, "Alice", 75.0),
                new Transaction(7, "Bob", 120.0),
                new Transaction(8, "David", 90.0),
                new Transaction(9, "Eve", 130.0),
                new Transaction(10, "Charlie", 80.0),
                new Transaction(11, "Eve", 170.0),
                new Transaction(12, "Alice", 60.0),
                new Transaction(13, "David", 110.0),
                new Transaction(14, "Bob", 140.0),
                new Transaction(15, "Charlie", 60.0),
                new Transaction(16, "Frank", 250.0),
                new Transaction(17, "Grace", 300.0),
                new Transaction(18, "Frank", 180.0),
                new Transaction(19, "Eve", 90.0),
                new Transaction(20, "Grace", 120.0)
        ));

        transactions.stream().collect(Collectors.groupingBy(Transaction::getUser,Collectors.summingDouble(Transaction::getAmount)))
                .forEach((user,amout)->System.out.println(user+"  ||  "+amout));
    }
}
