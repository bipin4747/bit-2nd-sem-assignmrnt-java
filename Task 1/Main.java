public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Everest Bank");

        Customer c1 = new Customer("Bipin Bhattarai", 22);
        Account a1 = new Account(c1, 1500.00);

        Customer c2 = new Customer("Rita Sharma", 30);
        Account a2 = new Account(c2);

        System.out.println("--- Account 1 Details ---");
        a1.displayAccountDetails();

        System.out.println("\n--- Account 2 Details ---");
        a2.displayAccountDetails();

        a1 = null;
        a2 = null;

        System.gc(); // Suggest garbage collection for finalize()
    }
}