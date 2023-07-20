public class Account_650031 {
    public static void main(String[] args) {
        Account AC1 = new Account(1, "Yok", 90);
        Account AC2 = new Account(2, "Pete", 90);
        AC1.transferTo(AC2, 20);
        AC2.transferTo(AC1, 110);
        AC1.credit(50);
        AC2.credit(30);
        AC1.debit(30);
        AC2.debit(20);
        System.out.println(AC1);
        System.out.println(AC2);
    }
}

class Account {
    int id;
    String name;
    int balance = 0;

    Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    int getID() {
        return this.id;
    }

    String name() {
        return this.name;
    }

    int balance() {
        return this.balance;
    }

    int credit(int amount) {
        return this.balance += amount;
    }

    int debit(int amount) {
        if (this.balance >= amount)
            return this.balance -= amount;
        else {
            System.out.println("Insufficient balance");
            return this.balance;
        }
    }

    int transferTo(Account Account65, int amount) {
        if (this.balance >= amount) {
            Account65.balance += amount;
            return this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
            return this.balance;
        }
    }

    public String toString() {
        return String.format("Account %s(%d) balance is %d", name, id, balance);
    }
}