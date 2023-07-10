package gmichelini.exercises.functional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {
    public static class Account {
        double amount;
        double interestRate;

        LocalDateTime duePayment;

        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDateTime getDuePayment() {
            return duePayment;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public void setDuePayment(LocalDateTime duePayment) {
            this.duePayment = duePayment;
        }
        private void applyInterestOn() {
            amount += amount * interestRate;
        }

    }

    public static List<Account> applyInterest(List<Account> accounts){
        return accounts.stream()
                .filter(s -> s.getDuePayment().isBefore(LocalDateTime.now()))
                .peek(Account::applyInterestOn)
                .sorted((o1,o2) -> (int)o2.getAmount() - (int)o1.getAmount())
                .collect(Collectors.toList());
    }
}



