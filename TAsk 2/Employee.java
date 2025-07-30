abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Abstract method
    public abstract void work();

    // Concrete method
    public void showDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + salary);
    }
}
