class Account {
    private static int count = 1000;
    private int accountNumber;
    private double balance;
    private Customer customer;

    public Account(Customer customer) {
        this(customer, 0.0); // Constructor overloading
    }

    public Account(Customer customer, double initialBalance) {
        this.customer = customer;
        this.balance = initialBalance;
        this.accountNumber = ++count;
    }

    public void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Age: " + customer.getCustomerAge());
        System.out.println("Balance: $" + balance);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Account " + accountNumber + " is being closed.");
    }
}
