package org.study.Statistical_AND_Parallel_Stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterTransactionAndSum {

//    From a list of Transaction objects with date, filter those from current month, group by category, and sum their amount.
    public class Transaction {
        private LocalDate date;
        private String category;
        private double amount;

        public Transaction(LocalDate date, String category, double amount) {
            this.date = date;
            this.category = category;
            this.amount = amount;
        }

        public LocalDate getDate() { return date; }
        public String getCategory() { return category; }
        public double getAmount() { return amount; }

        @Override
        public String toString() {
            return "Transaction{" +
                    "date=" + date +
                    ", category='" + category + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }

    public static void main(String sk[]){
        FilterTransactionAndSum obj=new FilterTransactionAndSum();
        List<Transaction> transactions =new ArrayList<>( List.of(
                obj.new Transaction(LocalDate.now().minusDays(1), "Groceries", 45.0),
                obj.new Transaction(LocalDate.now().minusDays(2), "Utilities", 120.0),
                obj.new Transaction(LocalDate.now().minusDays(3), "Entertainment", 60.0),
                obj.new Transaction(LocalDate.now().minusDays(5), "Groceries", 35.5),
                obj.new Transaction(LocalDate.now().minusDays(4), "Entertainment", 25.0),
                obj.new Transaction(LocalDate.now(), "Utilities", 100.0),
                obj.new Transaction(LocalDate.now().minusDays(6), "Transport", 15.75),
                obj.new Transaction(LocalDate.now().minusDays(10), "Rent", 800.0),
                obj.new Transaction(LocalDate.now().minusDays(12), "Groceries", 22.0),
                obj.new Transaction(LocalDate.now().minusDays(15), "Entertainment", 95.0),

                obj.new Transaction(LocalDate.now().minusMonths(1), "Groceries", 50.0),
                obj.new Transaction(LocalDate.now().minusMonths(1).minusDays(2), "Rent", 950.0),
                obj.new Transaction(LocalDate.now().minusMonths(2), "Utilities", 130.0),
                obj.new Transaction(LocalDate.now().minusMonths(3), "Entertainment", 70.0),
                obj.new Transaction(LocalDate.now().minusMonths(1).minusDays(4), "Transport", 20.0),

                obj.new Transaction(LocalDate.now().minusDays(7), "Groceries", 19.99),
                obj.new Transaction(LocalDate.now().minusDays(8), "Transport", 30.0),
                obj.new Transaction(LocalDate.now().minusDays(9), "Rent", 820.0),
                obj.new Transaction(LocalDate.now().minusDays(11), "Utilities", 75.0),
                obj.new Transaction(LocalDate.now().minusDays(13), "Groceries", 41.5)
        ));

        Map<String, Double> result=transactions.stream()
                .filter(transaction -> transaction.getDate().getMonth()==LocalDate.now().getMonth()
                                        &&transaction.getDate().getYear()==LocalDate.now().getYear() )
                .collect(Collectors.groupingBy(Transaction::getCategory,Collectors.summingDouble(Transaction::getAmount)));
        System.out.println(result);
    }
}
