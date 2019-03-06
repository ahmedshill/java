public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("Abdi", "001", 3000);
        Account acc2 = new Account("Ali", "002", 7000);
        Account acc3 = new Account("Ahmed", "003", 900);
        Account acc4 = new Account("Barre", "004", 80000);
        Account acc5 = new Account("Shill", "005", 100);

        System.out.println(acc1.getBalance());
        acc1.setBalance(7890);
        System.out.println(acc1.getBalance());

        acc2.deposit(1000);
        acc2.printDetails();
        acc2.withdraw(100);
        acc2.printDetails();
        String name = "John";
        name.toLowerCase();
        int x = 20;
        double z = 88;
        boolean finished = true;
        Account[] accounts ={acc1, acc2, acc3, acc4, acc5};
        for (Account k : accounts){
            k.deposit(100);
            k.printDetails();
        }


    }
}



