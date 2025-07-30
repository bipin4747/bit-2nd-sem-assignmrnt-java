public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Upcasting: subclass object referenced as superclass
        Employee e1 = new Manager("Alice", 101, 80000, 5);
        Employee e2 = new Developer("Bob", 102, 60000, "Java");
        Employee e3 = new Intern("Charlie", 103, 20000, "Tech University");

        // Method overriding in action
        e1.work(); 
        e2.work(); 
        e3.work(); 

        // Show details using superclass method
        e1.showDetails();
        e2.showDetails();
        e3.showDetails();

        // Downcasting to access subclass-specific methods
        if (e1 instanceof Manager) {
            ((Manager) e1).approveBudget();
        }

        if (e2 instanceof Developer) {
            ((Developer) e2).writeCode();
        }

        if (e3 instanceof Intern) {
            ((Intern) e3).attendTraining();
        }

        // Interface method call
        TaxPayer t1 = (TaxPayer) e1;
        System.out.println("Manager Tax: $" + t1.calculateTax());

        TaxPayer t2 = (TaxPayer) e2;
        System.out.println("Developer Tax: $" + t2.calculateTax());

        TaxPayer t3 = (TaxPayer) e3;
        System.out.println("Intern Tax: $" + t3.calculateTax());
    }
}
